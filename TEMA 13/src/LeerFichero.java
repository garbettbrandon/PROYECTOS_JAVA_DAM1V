import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		Leer_Fichero accediendo = new Leer_Fichero();
		
		accediendo.lee();
	}
}

class Leer_Fichero{ 
	public void lee() {
		try {
			FileReader entrada = new FileReader("C:/Users/brand/Desktop/hola.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			//int c = 0;
			
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