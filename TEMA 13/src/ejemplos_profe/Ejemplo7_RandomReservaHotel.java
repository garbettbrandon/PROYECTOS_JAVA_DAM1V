package ejemplos_profe;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo7_RandomReservaHotel {

	public static void main(String[] args) {
				
		try(RandomAccessFile ficheroReservas = new RandomAccessFile ("C:\\Users\\brand\\Desktop\\ficheros\\FicheroReservas.txt","rw")){
			ficheroReservas.seek(ficheroReservas.length());
			ficheroReservas.writeUTF("Maria Lopez");
			ficheroReservas.writeUTF("15/05/21");
			ficheroReservas.writeInt(5);
			ficheroReservas.writeDouble(80.5);
			ficheroReservas.writeUTF("Sergio Garcia");
			ficheroReservas.writeUTF("22/05/21");
			ficheroReservas.writeInt(3);
			ficheroReservas.writeDouble(60.3);
			
			//Recorrer el fichero y mostrar su contenido
			ficheroReservas.seek(0);
			while(true) {
				System.out.println("Posicion puntero: "+ficheroReservas.getFilePointer()+" Nombre del cliente:" +ficheroReservas.readUTF());
				System.out.println("Posicion puntero: "+ficheroReservas.getFilePointer()+" Fecha de entrada:" +ficheroReservas.readUTF());
				System.out.println("Posicion puntero: "+ficheroReservas.getFilePointer()+" Numero de noches:" +ficheroReservas.readInt());
				System.out.println("Posicion puntero: "+ficheroReservas.getFilePointer()+" Precio noche:" +ficheroReservas.readDouble());
			}				
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado en la ubicacion");
		} catch (EOFException e) {
			System.out.println("He llegado al final del fichero");
		} 
		catch (IOException e) {
			System.out.println("Error de acceso a fichero");
		}		
	}
}
