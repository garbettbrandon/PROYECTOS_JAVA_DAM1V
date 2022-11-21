
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P13_5 {

	public static void main(String[] args) {
		
		try (FileReader fAutor = new FileReader("C:/Users/brand/Desktop/ficheros/AUTOR.txt");
				RandomAccessFile rAutor = new RandomAccessFile("C:/Users/brand/Desktop/ficheros/rautor.txt", "rw")){
			//Copiar los datos del file al randomFile
			copiarDatos(fAutor,rAutor);
			
			visualizarRandom(rAutor);
			
			//Listado de autores de una nacionalidad
			listarNacionalidad(rAutor);
			
			//Pasar los datos del fichero random a una clase autor y añadir al ArrayList.
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		}catch (IOException e1) {
			System.out.println("Error entrada/ salida");
		}
		
		
	}

	public static void listarNacionalidad(RandomAccessFile r1) throws IOException {
		r1.seek(0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Que nacionalidad quieres buscar? ");
		String nacionalidad = sc.nextLine();
		try {
			while (true) {
				r1.readInt();
				r1.readUTF();
				r1.readUTF();
				r1.readUTF();
				if (r1.readUTF().equalsIgnoreCase(nacionalidad)) {
					System.out.print(r1.readInt()+"-");
					System.out.print(r1.readUTF()+"-");
					System.out.print(r1.readUTF()+"-");
					System.out.println(r1.readUTF());
				}
			}
		} catch (EOFException e) {
			System.out.println("Has llegado al final del fichero");
		}
		sc.close();
	}

	public static void visualizarRandom(RandomAccessFile r1) throws IOException {
		r1.seek(0);
		try {
			while (true) {
				System.out.print(r1.readInt()+"-");
				System.out.print(r1.readUTF()+"-");
				System.out.print(r1.readUTF()+"-");
				System.out.println(r1.readUTF());
			}
		} catch (EOFException e) {
			System.out.println("Has llegado al final del fichero");
		}
	}

	public static void copiarDatos(FileReader f1, RandomAccessFile r1) {
		try (BufferedReader miBuffer = new BufferedReader(f1);){
			String autor, nombre, apellidos, nacionalidad;
			int codigo;
			//Leer una linea del ficero de texto
			autor=miBuffer.readLine();
			
			while (autor != null) {
				//Pasamos sus datos a un vector de String
				String lectura [] = autor.split(";");
				
				//Cargamos en las variables los campos del registro y ajustamos el ancho.
				codigo=Integer.parseInt(lectura[0]);
				nombre = ajustarAncho(lectura[1],15);
				apellidos = ajustarAncho(lectura[2], 20);
				nacionalidad = ajustarAncho(lectura[3], 20);
				
				//Grabar datos en el fichero aleatorio
				//1º posicionar el puntero
				r1.seek((codigo -1) * 60);
				r1.writeInt(codigo);
				r1.writeUTF(nombre);
				r1.writeUTF(apellidos);
				r1.writeUTF(nacionalidad);
				
				//Paso a la siguiente linea del fichero
				autor=miBuffer.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("No lee el buffer");
		}
		
	}

	public static String ajustarAncho(String s, int ancho) {
		if (s.length() >= ancho) {
			return s.substring(0,ancho);
		}else {
			return String.format("%-"+ancho+"S",s);
		}
	}

}
