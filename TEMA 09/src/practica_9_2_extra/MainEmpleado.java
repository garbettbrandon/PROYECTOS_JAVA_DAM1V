package practica_9_2_extra;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainEmpleado {
	public static void main(String[] args) {
		Empleado e1 = new Empleado ();
		e1.setNombre("Brandon");
		e1.setNif("Y5667775E");
		e1.setSueldo(1000);
		e1.setNumHijos(0);
		
		Calendar fecha = new GregorianCalendar(1996,4,11);
		int dia = fecha.get(Calendar.DATE);
		int mes = fecha.get(Calendar.MONTH);
		int año = fecha.get(Calendar.YEAR);
		
		System.out.println(dia+"/"+mes+"/"+año);
		
		e1.setFechaContrato(fecha);
		
		System.out.println(e1.toString());
	}
}