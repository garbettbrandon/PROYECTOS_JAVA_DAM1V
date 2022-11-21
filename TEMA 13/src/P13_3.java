import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P13_3 {

	public static void main(String[] args) throws IOException {
		
		int [] array_repe = new int [50];
		
		for (int i = 0; i < 200; i++) {
			array_repe[(int) (Math.random()*49+1)] += 1;
		}
		
		try (RandomAccessFile fichero1 = new RandomAccessFile("C:/Users/brand/Desktop/ficheros/eje3", "rw")){
			for (int i = 0; i < array_repe.length; i++) {
				fichero1.writeInt(array_repe[i]);
			}
			visualizarFichero(fichero1);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Que numero quieres contar?");
			int dato = sc.nextInt();
			while(dato>0&&dato<50) {
				fichero1.seek(dato*4);
				System.out.println(fichero1.readInt());
				System.out.println("¿Qué número quieres contar?");
				dato=sc.nextInt();
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		}
	}

	public static void visualizarFichero(RandomAccessFile r) throws IOException {
		try {
			r.seek(0);
			r.skipBytes(4);
			int cont = 1;
			while (true) {
				System.out.println("Dato "+cont+" : "+r.readInt());
				cont++;
			}
		} catch (EOFException e) {
			System.out.println("Has terminado de recorrer el fichero");
		}
	}
}