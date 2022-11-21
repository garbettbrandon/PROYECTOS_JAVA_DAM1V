import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P13_4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try (RandomAccessFile res = new RandomAccessFile("C:/Users/brand/Desktop/ficheros/reservas.txt", "rw")){
			
			int opcion;

			do {
				menu();

				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case 1:
					registrarReserva(res);
					break;
				case 2:
					consultarReserva(res);
					break;
				case 3:
					listarReservas(res);
					break;
				case 4:
					mostrarInforme(res);
					break;
				case 5:
					break;
				default:
					System.out.print(" Opcion no valida. Introducir una opcion valida, por favor. ");
				}
			} while (opcion != 5);
			sc.next();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e1) {
			System.out.println("Error Entrada / Salida");
		}
	}
	
	public static void menu() {
		System.out.println(" BIENVENIDO AL HOTEL ");
		System.out.println(" =================== ");
		System.out.println(" 1. REGISTRAR RESERVA. ");
		System.out.println(" 2. CONSULTAR RESERVA. ");
		System.out.println(" 3. LISTAR RESERVA. ");
		System.out.println(" 4. IMFORME MENSUAL DE VENTAS. ");
		System.out.println(" 5. SALIR. \n \n ");
		System.out.print(" Introduzca una opcion: ");
	}

	public static void registrarReserva(RandomAccessFile res) throws IOException {
		res.seek(res.length());
		System.out.print("Nombre del cliente: ");
		res.writeUTF(sc.nextLine());
		System.out.print("Fecha de entrada (formato dd/mm/yy): ");
		res.writeUTF(sc.nextLine());
		System.out.print("Numero de noches: ");
		res.writeInt(sc.nextInt());
		System.out.print("Precio/noche: ");
		res.writeDouble(sc.nextDouble());
		
		System.out.println("\n");
	}

	public static void consultarReserva(RandomAccessFile res) throws IOException {
		try {
			System.out.print("Introduce el nombre del cliente del cual consultar reserva: ");
			String clienteConsulta = sc.nextLine();
			res.seek(0);
			while(true) {
				res.readUTF();
				if (clienteConsulta.equalsIgnoreCase(res.readUTF())) {
					System.out.println("Posicion puntero: "+res.getFilePointer()+" Nombre del cliente:" +res.readUTF());
					System.out.println("Posicion puntero: "+res.getFilePointer()+" Fecha de entrada:" +res.readUTF());
					System.out.println("Posicion puntero: "+res.getFilePointer()+" Numero de noches:" +res.readInt());
					System.out.println("Posicion puntero: "+res.getFilePointer()+" Precio noche:" +res.readDouble());
				}else {
					System.out.println("No se ha encontrado reserva con ese nombre de cliente");
				}
				res.readUTF();
				res.readInt();
				res.readDouble();
			}
		} catch (EOFException e) {
			System.out.println("Has terminado de recorrer el fichero");
		}
		
		System.out.println("\n");
	}

	public static void listarReservas(RandomAccessFile res) throws IOException {
		try {
			res.seek(0);
			while(true) {
				System.out.println("Posicion puntero: "+res.getFilePointer()+" Nombre del cliente:" +res.readUTF());
				System.out.println("Posicion puntero: "+res.getFilePointer()+" Fecha de entrada:" +res.readUTF());
				System.out.println("Posicion puntero: "+res.getFilePointer()+" Numero de noches:" +res.readInt());
				System.out.println("Posicion puntero: "+res.getFilePointer()+" Precio noche:" +res.readDouble());
			}
		} catch (EOFException e) {
			System.out.println("Has terminado de recorrer el fichero");
		}
		
		System.out.println("\n");
	}

	public static void mostrarInforme(RandomAccessFile res) {
		
	}
}
