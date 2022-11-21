package ejemplo;

import java.time.LocalTime;
import java.util.ArrayList;

public class Ejemplo_Array {
	
	public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

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
