import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaLecturaCaracter_2 {

	public static void main(String[] args) throws IOException {
		try {
			FileReader miFichero = new FileReader("C:/Users/brand/Desktop/Brandon.txt");
			int c = 0;
			while (c!=-1) {
				c = miFichero.read();
				char letra = (char) c;
				System.out.print(letra);
			}
			miFichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
		
		FileWriter salida = new FileWriter("C:/Users/brand/Desktop/Brandon.txt",true);
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Introduce el texto: ");
		frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			salida.write((int) frase.charAt(i));
		}
		salida.write((int) '\n');
		salida.close();
		sc.close();
	}
}