package P11_1;

import java.util.Scanner;

public class Controladora {

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador();
		t1.setNombre("Brandon");
		t1.setEdad(26);
		t1.setTelefono(3333333);
		t1.setCategoria('A');
		t1.setAntiguedad(3);

		// Pedir datos para el t2
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();
		
		
		char cat = 0;
		boolean error = false;
		do {
			try {
				System.out.println("Introduce la categoria: ");
				cat = (char) System.in.read();
			}catch(Exception e){
				System.out.println(e.getMessage());
				error = true;
			}
		} while (error && cat != 'A' && cat != 'B' && cat != 'C');
		
		int edad, tel, ant;
		System.out.println("Introduce la edad: ");
		edad = sc.nextInt();
		System.out.println("Introduce el telefono: ");
		tel = sc.nextInt();
		System.out.println("Introduce la antiguedad: ");
		ant = sc.nextInt();

		sc.close();

		// Invocar t2
		Trabajador t2 = new Trabajador(nombre, edad, tel, cat, ant);

		// Pintar t2
		System.out.println("Trabajador 1 \n" + t1.toString());
		System.out.println();
		System.out.println("Trabajador 2 \n" + t2.toString());

		if (t1.getAntiguedad() > t2.getAntiguedad()) {
			System.out.println("El trabajador con mas antiguedad es " + t1.getNombre());
		} else {
			System.out.println("El trabajador con mas antiguedad es " + t2.getNombre());
		}

	}

}
