package gregorianCalendar;

import java.util.Date;

public class EjemploClaseDate {
	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);
		Date fecha2 = new Date(96,3,11);
		System.out.println(fecha2);
		Date fecha3 = new Date (0,0,0);
		System.out.println(fecha3);
		fecha.toLocaleString();
		System.out.println(fecha);
		System.out.println(fecha.before(fecha2));
	}
}
