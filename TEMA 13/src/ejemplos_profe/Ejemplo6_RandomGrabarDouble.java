package ejemplos_profe;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejemplo6_RandomGrabarDouble {

	public static void main(String[] args) {
			RandomAccessFile miFicheroAleatorio= null;
			Scanner in = new Scanner(System.in);
			//Escritura del fichero
			try  { 
				miFicheroAleatorio = new RandomAccessFile("C:\\Users\\malimon\\desktop\\miFicheroAleatorio.dat","rw");
				double numero=0;
				for (int i = 0; i < 6; i++) {
					numero = Math.random()*100;
					miFicheroAleatorio.writeDouble(numero);					
				}				
			} catch (FileNotFoundException e) {
				System.out.println("Fichero no encontrado");
			} catch (IOException e1) {
				System.out.println("Error de acceso a fichero");
			}
			
			//Lectura del fichero y mostrar un valor pedido por teclado
			try {
				int cont=1;
				miFicheroAleatorio.seek(0);
				while(miFicheroAleatorio.getFilePointer()<miFicheroAleatorio.length()) {
					System.out.printf("%2d  :  %.2f \n",cont,miFicheroAleatorio.readDouble());
					cont++;
				}	
				System.out.print("A qu� n�mero de la lista quiere acceder?:");
				int posicion = in.nextInt();
				if(posicion >0 && posicion<=6) {
					miFicheroAleatorio.seek((posicion-1)*8);
					System.out.println("El n�mero que est� en la posici�n "+posicion+" es "+miFicheroAleatorio.readDouble());
				}else 
					System.out.println("posici�n no v�lida");
				
			}catch(EOFException e) {
				System.out.println("He terminado de leer el Fichero");				
			}
			catch (IOException e) {
				System.out.println("Error de lectura del fichero");
				e.printStackTrace();
			}
			

	}

}
