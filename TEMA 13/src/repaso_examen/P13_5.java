package repaso_examen;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P13_5 {
	public static Scanner dato = new Scanner(System.in);

	public static void main(String[] args) {
				
		String rutaAu= "C:/Users/brand/Desktop/PRACTICA_13_5/AUTOR.txt";
		String rutaRAu="C:/Users/brand/Desktop/PRACTICA_13_5/AUTOR.dat";
		
		try(FileReader fAutor = new FileReader(rutaAu);
			RandomAccessFile rAutor = new RandomAccessFile(rutaRAu, "rw")){
						
			//Pasar Autor del fichero de texto al fichero Random
			pasarAutor(fAutor,rAutor);
			
			//Visualizar el contenido del RandomAccessFile
			visualizarRandom(rAutor);
			
			//Visualizar un autor determinado a partir del código introducido por teclado
			buscarAutor(rAutor);
			
			// Visualizar autores de una nacionalidad introducida por teclado 
			buscarNacionalidad(rAutor);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicación");
		} catch (EOFException e) {
			System.out.println("He llegado al final del fichero");
		} catch (IOException e) {
			System.out.println("Error de acceso a fichero");
		}
		
	}
	
	public static void pasarAutor(FileReader fA,RandomAccessFile rA) throws IOException{
		try(BufferedReader miBuffer = new BufferedReader(fA)){
			String autor;
		
			autor=miBuffer.readLine();
			while(autor!=null) {	
				autor=autor.replace("\"","");
				String datos[] = autor.split(";");
							
				//Ajustar longitud de los campos
				datos[1]=ajustarCadena(datos[1],15);
				datos[2]=ajustarCadena(datos[2],20);
				datos[3]=ajustarCadena(datos[3],15);
				
				//Posicionar el puntero según codigo de autor
				rA.seek(60*(Integer.parseInt(datos[0])-1));
				
				//Grabar registro 
				rA.writeInt(Integer.parseInt(datos[0]));
				rA.writeUTF(datos[1]);
				rA.writeUTF(datos[2]);
				rA.writeUTF(datos[3]);
				
				autor=miBuffer.readLine();
			}	
		} 		
	}
	
	public static void visualizarRandom(RandomAccessFile rA) throws IOException{
		System.out.println("CONTENIDO FICHERO ALEATORIO DE AUTORES");
		try {
			rA.seek(0);
			while(true) {
				System.out.printf("Código:%d\tnombre:%S\tapellidos:%S\tnacionalidad:%s\n"
						,rA.readInt(),rA.readUTF(),rA.readUTF(),rA.readUTF());
			}
		}catch(EOFException e) {
			System.out.println("Fin de Fichero");
		}
		
	}

	
	public static void buscarAutor(RandomAccessFile rA) throws IOException{
		int codigo;
		try {
			System.out.print("Introduzca el código de autor que quiere buscar:");
			codigo=dato.nextInt();	
			dato.nextLine();
			//Posicionarse en el autor
			rA.seek((codigo-1)*60);
			System.out.printf("Código:%d\tnombre:%S\tapellidos:%S\tnacionalidad:%s\n"
					,rA.readInt(),rA.readUTF(),rA.readUTF(),rA.readUTF());
			
		}catch(EOFException e ) {
			System.out.println("El autor no se encuentra en el fichero");
		}
	}
	
	
	public static void buscarNacionalidad(RandomAccessFile rA) throws IOException{
		System.out.println("¿qué nacionalidad quiere buscar?:");
		String respuesta=dato.next();
		int codigo;
		String nombre,apellidos,nacionalidad;
		System.out.println("AUTORES DE NACIONALIDAD "+respuesta);
		try {
			rA.seek(0);			
			while(true) {
				codigo=rA.readInt();
				nombre=rA.readUTF();
				apellidos=rA.readUTF();
				nacionalidad=rA.readUTF().trim();
				if(nacionalidad.equalsIgnoreCase(respuesta))
					System.out.printf("Código:%d\tnombre:%S\tapellidos:%S\tnacionalidad:%s\n"
						,codigo,nombre,apellidos,nacionalidad);
			}
		}catch(EOFException e) {
			System.out.println("Fin de Fichero");
		}
		
		
		
	}
	
	
	public static String ajustarCadena(String s, int tamanio) {
		if(s.length()>=tamanio) s=s.substring(0,tamanio);
		else s=String.format("%-"+tamanio+"S",s);  
		return s;
	}

}