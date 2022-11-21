import java.io.*;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args) {
		escribir();
	}

	public static void escribir() {
		try {
			Scanner sc = new Scanner(System.in);
			String frase;
			System.out.println("Introduce el texto: ");
			frase = sc.nextLine();

			FileWriter salida = new FileWriter("C:/Users/brand/Desktop/ejer.txt", true);

			salida.write(frase + '\n');

			salida.close();
			sc.close();

		} catch (IOException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
	}
	
	
}
