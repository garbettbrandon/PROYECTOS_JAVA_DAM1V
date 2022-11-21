import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P13_2 {

	public static void main(String[] args){
		try (FileInputStream primero = new FileInputStream("C:/Users/brand/Desktop/ficheros/brandon.txt");
			FileInputStream segundo = new FileInputStream("C:/Users/brand/Desktop/ficheros/brandon2.txt")){
			
			int dato1, dato2, cont = 0;
			boolean iguales = false;
			
			dato1 = primero.read();
			dato2 = segundo.read();
			
			while (dato1 != -1 && dato2 != -1) {
				
				dato1 = primero.read();
				dato2 = segundo.read();
				cont++;
				
				if (dato1 != dato2) {
					iguales = false;
				}else {
					iguales = true;
				}
			}
			
			if (iguales == false) {
				System.out.println("Los ficheros son distintos a partir del "+cont+" byte");
			}else {
				System.out.println("Los ficheros son iguales");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("EL archivo no se ha encontrado.");
		} catch (IOException e1) {
			System.out.println("ERROR ENTRADA SALIDA");
		}
	}
}