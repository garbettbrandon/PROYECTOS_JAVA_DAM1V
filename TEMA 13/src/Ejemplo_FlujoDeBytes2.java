import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo_FlujoDeBytes2 {

	public static void main(String[] args){
		try (FileInputStream imagen = new FileInputStream("C:/Users/brand/Desktop/imagen.jpg");
			FileOutputStream imagenCopia = new FileOutputStream("C:/Users/brand/Desktop/copia.jpg",true);){
			
			int dato = 0;
			dato = imagen.read();
			
			while (dato != -1) {
				imagenCopia.write(dato);
				dato = imagen.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("EL archivo no se ha encontrado.");
		} catch (IOException e1) {
			System.out.println("ERROR ENTRADA SALIDA");
		}
	}
}