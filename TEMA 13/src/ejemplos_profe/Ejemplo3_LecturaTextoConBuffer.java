package ejemplos_profe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo3_LecturaTextoConBuffer {
	public static void main(String[] args) {
		FileReader entrada=null;
		BufferedReader miBuffer=null;
		try {
			entrada= new FileReader("C:\\Users\\malimon\\Desktop\\FicheroPruebaLectura.txt");
			miBuffer = new BufferedReader(entrada);
			String frase="";
			frase=miBuffer.readLine();
			while (frase!=null) {
				System.out.println(frase);
				frase=miBuffer.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura de Fichero");
			e.printStackTrace();
		} finally {
			try {
				entrada.close();
				miBuffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
