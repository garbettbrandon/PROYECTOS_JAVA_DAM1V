import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PruebaLecturaCaracter_3 {

	public static void main(String[] args) {
	
		try {
			FileReader miFichero = new FileReader("C:/Users/brand/Desktop/ejercicio3.txt");
			
			BufferedReader miBuffer = new BufferedReader(miFichero);
			
			String linea = "";
			
			while (linea!=null) {
				linea = miBuffer.readLine();
				if (linea != null) System.out.println(linea);
			}
			
			miBuffer.close();
			miFichero.close();
			
		} catch (IOException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
		
		try {
			Scanner sc = new Scanner(System.in);
			String frase;
			System.out.println("Introduce el texto: ");
			frase = sc.nextLine();
			
			FileWriter salida = new FileWriter("C:/Users/brand/Desktop/ejercicio3.txt",true);
			salida.write(frase+'\n');

			salida.close();
			sc.close();
			
		} catch (IOException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
	}
}