import java.io.FileReader;
import java.io.IOException;

public class PruebaLecturaCaracter_1 {

	public static void main(String[] args) {
		try {
			FileReader miFichero = new FileReader("C:/Users/brand/Desktop/hola.txt");
			int c = 0;
			while (c!=-1) {
				c = miFichero.read();
				char letra = (char)c;
				System.out.print(letra);
			}
			miFichero.close();
		} catch (IOException e) {
			System.out.println("El fichero no existe o no está en la ubicación indicada");
		}
	}
}