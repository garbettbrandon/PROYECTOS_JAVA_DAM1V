import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Biblioteca {

	public static void main(String[] args) {
	
		try (FileReader fAutor = new FileReader("C:\\Users\\malimon\\Desktop\\AUTOR.txt");
			 RandomAccessFile rAutor = new RandomAccessFile("C:\\Users\\malimon\\Desktop\\RAUTOR.dat","rw");  ) {
			//Copiar los datos del fichero de texto al fichero Aleatorio
			copiarDatos(fAutor,rAutor);
			visualizarFicheroRandom(rAutor);
			
			
		}catch(FileNotFoundException e) {
			System.out.println("FICHERO NO ENCONTRADO");
		} catch (IOException e1) {
			System.out.println("ERROR DE ENTRADA/SALIDA");
		}
	}
	
	public static void copiarDatos(FileReader fA, RandomAccessFile rA) throws IOException {
		try(BufferedReader miBuffer = new BufferedReader(fA)){
			String autor,nombre,apellidos,nacionalidad;
			int codigo,cont=0;
			//Leer una linea del fichero de texto
			autor=miBuffer.readLine();
			while(autor!=null) {
				cont++;
				//Pasamos sus datos a un vector de String
				String lectura[ ]= autor.split(";");
				//Cargamos en las variables los campos del registro y ajustamos ancho
				codigo=Integer.parseInt(lectura[0]);
				nombre=ajustarAncho(lectura[1],15);
				apellidos=ajustarAncho(lectura[2],20);
				nacionalidad=ajustarAncho(lectura[3],15);
				
				//Grabar datos en el fichero aleatorio
				//Posicionar el puntero
				rA.seek((codigo-1)*55);
				rA.writeInt(codigo);
				rA.writeUTF(nombre);
				rA.writeUTF(apellidos);
				rA.writeUTF(nacionalidad);
				//Paso a la siguiente linea del fichero de texto
				autor=miBuffer.readLine();
				System.out.println("Lectura del buffer");
			}
		} 
	}
	
	public static void visualizarFicheroRandom(RandomAccessFile rA) throws IOException {
		rA.seek(0);
		try {
			while(true) {
				System.out.print(rA.readInt()+"-");
				System.out.print(rA.readUTF()+"-");
				System.out.print(rA.readUTF()+"-");
				System.out.println(rA.readUTF());				
			}
		}catch(EOFException e) {
			System.out.println("He llegado al final del fichero");
		}		
	}
	
	public static String ajustarAncho(String s, int ancho) {
		if(s.length()>= ancho) return s.substring(0,ancho).replace('á','a').replace('é', 'e').replace('í','i').replace('ó','o').replace('ú','u');
		else return String.format("%-15S",s).replace('á','a').replace('é', 'e').replace('í','i').replace('ó','o').replace('ú','u');
	}

}
