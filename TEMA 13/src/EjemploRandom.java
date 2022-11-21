
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EjemploRandom {

	public static void main(String[] args) {
		try (RandomAccessFile ficheroRandom = new RandomAccessFile("C:/Users/brand/Desktop/ficheros/Random.txt", "rw")){
			
			ficheroRandom.seek(ficheroRandom.length());
			
			System.out.println("Posicion del puntero antes de escribir: "+ficheroRandom.getFilePointer());
			
			for (int i = 0; i < 5; i++) {
				ficheroRandom.writeDouble(Math.random()*100);
				System.out.println("Posicion del puntero despues de el dato: "+(i+1)+": "+ficheroRandom.getFilePointer());
			}
			
			System.out.println();
			
			visualizarFichero(ficheroRandom);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("A que posicion quiere desplazarse?");
			long dato=sc.nextLong();
			
			ficheroRandom.seek((dato-1)*8);
			
			System.out.println(ficheroRandom.readDouble());
		
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e1) {
			System.out.println("Error E/S");
		}
	}

	public static void visualizarFichero(RandomAccessFile f) throws IOException {
		try {
			f.seek(0);
			int cont = 1;
			while (true) {
				System.out.println("Dato "+cont+": "+f.readDouble());
				cont ++;
			}
		} catch (EOFException e) {
			System.out.println("He terminado de recorrer el fichero");
		}
	}
}