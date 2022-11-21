package p12_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorCorreo {

	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Correo> listaCorreo = new ArrayList<>();

	public static void main(String[] args) {

		int opcion;

		do {
			// Al inicio de cada iteraci�n mostramos el men�, y recogemos la opci�n
			menu();

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				bandejaEntrada();
				break;
			case 2:
				añadirCorreo();
				break;
			case 3:
				eliminarCorreo();
				break;
			case 4:
				mostrarCorreo();
				break;
			case 5:
				mostrarTodos();
				break;
			case 6:
				mostrarCorreosOrigen();
				break;
			case 7:
				break;
				
			default:
				System.out.print(" Opci�n no v�lida. Introducir una opci�n v�lida, por favor. ");
			}

		} while (opcion != 7);
		sc.next();
	}

	private static void mostrarCorreosOrigen() {
		if (listaCorreo.isEmpty()) {
			System.out.println(" No tienes correos \n ");
		} else {
			System.out.print(" Ingrese el origen del correo: ");
			String origen = sc.nextLine();
			for (int i = 0; i < listaCorreo.size(); i++) {
				Correo c = listaCorreo.get(i);
				if (c.getOrigen().equals(origen)) {
					System.out.printf(" %d %s ", i, c.getCuerpo());
				}
			}
			System.out.println("\n");
		}
	}

	private static void mostrarTodos() {
		if (listaCorreo.isEmpty()) {
			System.out.println(" No tienes correos \n ");
		} else {
			for (int i = 0; i < listaCorreo.size(); i++) {
				Correo c = listaCorreo.get(i);
				System.out.printf(" %d %s \n", i, c.getCuerpo());
			}
			System.out.println("\n");
		}
	}

	private static void mostrarCorreo() {
		System.out.println(" \n \n VER CORREO ");
		System.out.println(" Ingrese la posici�n del correo: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaCorreo.size()) {
			System.out.println(" Posici�n erronea ");
		} else {
			Correo c = listaCorreo.get(posicion);
			System.out.printf(" %d %s ", posicion, c.getCuerpo());
		}
		System.out.println("\n");
	}

	private static void eliminarCorreo() {
		System.out.println(" \n \n ELIMINAR CORREO ");
		System.out.print(" Ingrese la posici�n del correo: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaCorreo.size()) {
			System.out.println(" Posici�n erronea ");
		} else {
			System.out.print(" �Est� usted seguro de querer eliminar el correo? (S / N): ");
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase("S")) {
				listaCorreo.remove(posicion);
				System.out.println("Correo BORRADO");
			}else {
				System.out.println("Correo NO BORRADO!");
			}
		}
		System.out.println("\n");

	}

	private static void añadirCorreo() {
		System.out.println(" \n \n A�ADIR CORREO ");
		System.out.print(" Introduzca el ORIGEN: ");
		String origen = sc.nextLine();
		System.out.print(" Introduzca el DESTINO: ");
		String destino = sc.nextLine();
		System.out.print(" Introduzca el ASUNTO: ");
		String asunto = sc.nextLine();
		System.out.print(" Introduzca el CUERPO: ");
		String cuerpo = sc.nextLine();

		listaCorreo.add(new Correo(origen, destino, asunto, cuerpo, LocalDateTime.now()));

		System.out.println("\n");
	}

	private static void bandejaEntrada() {
		if (listaCorreo.isEmpty()) {
			System.out.println(" No tienes correos en la bandeja de entrada \n ");
		} else {
			for (int i = 0; i < listaCorreo.size(); i++) {
				Correo c = listaCorreo.get(i);
				System.out.printf(" %d %s %s %s \n", i, c.getOrigen(), c.getAsunto(), c.getFecha());
			}
			System.out.println("\n");
		}
	}

	public static void menu() {
		System.out.println(" BIENVENIDO A TU CORREO ");
		System.out.println(" =================== ");
		System.out.println(" 1. Bandeja de entrada. ");
		System.out.println(" 2. A�adir correo. ");
		System.out.println(" 3. Eliminar correo. ");
		System.out.println(" 4. Mostrar un correo. ");
		System.out.println(" 5. Mostrar todos los correos. ");
		System.out.println(" 6. Mostrar correos a partir de su origen. ");
		System.out.println(" 7. Salir. \n \n ");
		System.out.print(" Introduzca una opci�n: ");
	}

}
