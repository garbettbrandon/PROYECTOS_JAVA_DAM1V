package ejemplos_profe;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo2_EscrituraFlujoCaracteres {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		FileWriter salida =null;
		
		try {
			salida = new FileWriter("C:\\Users\\malimon\\Desktop\\FicheroPruebaLectura.txt",true);
			System.out.println("Introduzca el texto que quiere guardar en el fichero: ");
			salida.write("\n");
			String frase= in.nextLine();
			char caracter;
			for (int i = 0; i < frase.length(); i++) {
				caracter=frase.charAt(i);
				salida.write(caracter);				
			}		
		}  catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura de Fichero");
			e.printStackTrace();
		} finally {
			try {
				salida.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
