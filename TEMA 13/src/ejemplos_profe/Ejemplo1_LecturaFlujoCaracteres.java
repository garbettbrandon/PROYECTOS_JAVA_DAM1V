package ejemplos_profe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1_LecturaFlujoCaracteres {

	public static void main(String[] args) {
		FileReader entrada=null;
		try {
			entrada= new FileReader("C:\\Users\\malimon\\Desktop\\FicheroPruebaLectura.txt");
			int numLetra=0;
			numLetra=entrada.read();
			while (numLetra!=-1) {
				System.out.print((char)numLetra);
				numLetra=entrada.read();
				//System.out.println((char)entrada.read());
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
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
