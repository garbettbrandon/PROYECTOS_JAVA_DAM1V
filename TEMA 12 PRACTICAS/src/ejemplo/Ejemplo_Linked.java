package ejemplo;

import java.time.LocalTime;
import java.util.LinkedList;

public class Ejemplo_Linked {

	public static LinkedList<Alumno> listaAlumnos = new LinkedList<>();
	
	public static void main(String[] args) {
		LocalTime tiempoInicial = LocalTime.now();
		System.out.println("TIEMPO INICIAL: "+tiempoInicial);
		
		for (int i = 0; i < 10000; i++) {
			Alumno a = new Alumno("Brandon");
			listaAlumnos.add(i, a);
		}
		
		LocalTime tiempoFinal = LocalTime.now();
		System.out.println("TIEMPO FINAL: "+tiempoFinal);
		
		
		long dif = tiempoFinal.getNano()-tiempoInicial.getNano();
		
		System.out.println("La diferencia de tiempo es de: "+dif);
	}

}
