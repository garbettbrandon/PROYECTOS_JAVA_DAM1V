import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploDeberes {

	public static void main(String[] args) {
		
		escribir();
		
		lee();
	}

	public static void escribir() {
		try {
			Scanner sc = new Scanner(System.in);
			String frase;
			do {
				System.out.println("Introduce el texto: ");
				frase = sc.nextLine();
				FileWriter salida = new FileWriter("C:/Users/brand/Desktop/ejer.txt", true);
				if (!frase.equalsIgnoreCase("Stop")) {
					salida.write(frase + '\n');
				}
				salida.close();
			} while (!frase.equalsIgnoreCase("Stop"));
			sc.close();
		} catch (IOException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
	}

	public static void lee() {
		try {
			FileReader entrada = new FileReader("C:/Users/brand/Desktop/ejer.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while (linea!=null) {
				linea = miBuffer.readLine();
				if (linea != null) System.out.println(linea);
			}
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
	}
}