package ejemplos_profe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo5_LecturaEscrituraFlujoBytes {
	public static void main(String[] args) {
		//FileInputStream imagen=null;
		//FileOutputStream ficheroCopia=null;
		int numeroByte;
		try (FileInputStream imagen=new FileInputStream("F:\\fichero.jpg");FileOutputStream ficheroCopia= new FileOutputStream("F:\\CURSO 2020_2021\\PROGRAMACI�N\\FicheroCopia.jpg")) {
			 //imagen = new FileInputStream("F:\\fichero.jpg");
			// ficheroCopia = new FileOutputStream("F:\\CURSO 2020_2021\\PROGRAMACI�N\\FicheroCopia.jpg");
			 int contBytes=0;
			 numeroByte=imagen.read();
			 while (numeroByte!=-1) {
				 System.out.println(numeroByte);
				 ficheroCopia.write(numeroByte);
				 numeroByte=imagen.read();	
				 contBytes++;
			 }
			 System.out.println("He leido "+contBytes+" bytes");
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrada");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de acceso a fichero");
			e.printStackTrace();
		}
		
		
	}

}
