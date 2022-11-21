package gregorianCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemploClaseGregorian {
	public static void main(String[] args) {
		String meses[] = { "Ene", "Feb", "Mar", "Abr", "May", "Jun",
                "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		String dias[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
                "Domingo" };
		Calendar fecha1 = new GregorianCalendar();
		Calendar fecha2 = new GregorianCalendar(1996,3,11);
		System.out.println(fecha1.get(Calendar.DATE)+"/"+fecha1.get(Calendar.MONTH)+"/"+fecha1.get(Calendar.YEAR));
		System.out.println(dias[fecha2.get(Calendar.DAY_OF_WEEK)]+", "+fecha2.get(Calendar.DATE)+" de "+
		meses[fecha2.get(Calendar.MARCH)]+" de "+fecha2.get(Calendar.YEAR));
		//Calculo tiempo entre dos fechas
		Calendar fecha3 = new GregorianCalendar(2000,5,10);
		Calendar fecha4 = new GregorianCalendar(2000,5,13);
		Date firstDate = fecha3.getTime();
		Date secondDate = fecha4.getTime();
		long diferencia = secondDate.getTime() - firstDate.getTime();
        System.out.println ("Diferencia en dias: " + diferencia / 1000 / 60 / 60 / 24);
		//Calculo Bisiesto
		if (((GregorianCalendar) fecha1).isLeapYear(fecha1.get(Calendar.YEAR))) System.out.println("El año actual es bisiesto");
        else System.out.println("El año actual no es bisiesto");
		//Añadir valores a dia, mes o año
		fecha3.add(Calendar.DATE, 1);
		fecha3.add(Calendar.MONTH, 1);
		fecha3.add(Calendar.YEAR, 1);
		System.out.println(fecha3.get(Calendar.DATE)+"/"+fecha3.get(Calendar.MONTH)+"/"+fecha3.get(Calendar.YEAR));
	}
}
