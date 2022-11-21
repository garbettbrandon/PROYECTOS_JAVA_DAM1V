package PRACTICA_9_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainEmpleado {

	public static void main(String[] args) {
		/*Empleado emp[] = new Empleado[2];

		Scanner sc = new Scanner(System.in);

		String nombre = " ";

		for (int i = 0; i < emp.length; i++) {

			emp[i] = new Empleado();
			System.out.println("Escribe el nombre:");
			nombre = sc.nextLine();
			emp[i].setNombre(nombre);

			System.out.println("Escribe el sueldo:");
			emp[i].setSueldo(sc.nextDouble());
			
			sc.nextLine();
			
			emp[i].setFechaContrato(new Date());
			
			System.out.println("Mostrar info");
			System.out.println(emp[i].toString());
		}
		
		Empleado empleado_especial = new Empleado("Carlos", 1000, 11, 4, 1996);
		System.out.println(empleado_especial.toString());
		*/
		Empleado empleHijos = new Empleado("Ana", 1545, 11, 4, 1996, "Y389544", 0);
		System.out.println(empleHijos.toString());
		
		GregorianCalendar fecha = new GregorianCalendar();
		fecha.set(2019, 5, 12);
		Empleado empleGregoriano = new Empleado("Brandon", 3000, 0, fecha);
		System.out.println(empleGregoriano.toString());
		
		//Visualizar nomina
		/*System.out.printf("NOMINA DE %S \n",empleHijos.getNombre());
		System.out.println("Sueldo Bruto: "+empleHijos.getSueldo());
		System.out.printf("            IRPF : %.2f \n",(empleHijos.getSueldo()-empleHijos.sueldoNeto()));
		System.out.printf("            SUELDO NETO : %.2f \n",(empleHijos.sueldoNeto()));
		*/
		
		empleHijos.imprimirNomina();
		
		/*
		sc.close();

		emp[0].subirSueldo(0.05);
		emp[1].subirSueldo(0.03);

		System.out.println(emp[0].getSueldo());
		System.out.println(emp[1].getSueldo());
		*/
	}
}