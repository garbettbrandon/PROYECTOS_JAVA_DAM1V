package p11_3;

import java.util.Scanner;

public class MainEdificio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vecino v1 = new Vecino("Pedro", 16, "V12345", "F123", "Calle San Bruno");
		
		String dni;
		do {
			System.out.println("Introduzca el dni del vecino: ");
			dni = sc.nextLine();
		} while (v1.dniValido(dni) == false);
		sc.close();
		
		v1.setDni(dni);
		
		if (v1.esMayorDeEdad(v1.getEdad()) == false) {
			v1.setEdad(18);
		}
		
		Administrador a1 = new Administrador("Alfonso", "40032323H", 16, "A12345", "Calle San bruno", 20, 2300.8f);
		
		if (a1.esMayorDeEdad(a1.getEdad()) == false) {
			a1.setEdad(18);
		}
		
		Vecino.setCuota(200);
		if (a1.getSalario() > a1.salarioMax(Vecino.getCuota())) {
			a1.setSalario((float) a1.salarioMax(Vecino.getCuota()));
		}
		
		System.out.println(v1.toString());
		
		System.out.println(a1.toString());
		
	}

}
