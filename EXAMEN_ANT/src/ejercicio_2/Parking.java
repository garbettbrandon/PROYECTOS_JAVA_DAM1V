package ejercicio_2;

import java.util.ArrayList;
import java.util.Date;

public class Parking {

	public static void main(String[] args) {
		Date fecha1 = new Date("30/09/2022");
		Coche coche1 = new Coche("ASF4566",fecha1, "Audi", "A5", 2.5);
		Date fecha2 = new Date("09/10/2022");
		Coche coche2 = new Coche("BSSR345",fecha2, "BMW", "M3", 2.3);
		
		Date fecha3 = new Date("09/10/2021");
		Camion camion1 = new Camion("DFRR567", fecha3, 4);
		
		coche1.calcularImporte();
		camion1.calcularImporte();
		
		coche1.pasarRevision();
		coche2.pasarRevision();
		
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(camion1);
			
	}
}
