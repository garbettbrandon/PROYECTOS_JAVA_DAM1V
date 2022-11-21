package PRACTICA_9_1;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Persona p[] = new Persona[2]; 
		Scanner sc = new Scanner(System.in);
		
		String nombre = " ";
	
		for (int i = 0; i < p.length; i++) {
			
			p[i]=new Persona();
			System.out.println("Escribe el nombre:");
			nombre = sc.nextLine();
			p[i].setNombre(nombre);
			System.out.println("Escribe el telefono:");
			p[i].setTelefono(sc.nextInt());
			System.out.println("Escribe la edad:");
			p[i].setEdad(sc.nextInt());
			System.out.println("Mostrar info");
			System.out.println(p[i].toString());	
			
			sc.nextLine();
		}
		
		sc.close();
	}
}
