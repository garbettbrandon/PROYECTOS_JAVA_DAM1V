package practica_9_6;

public class P9_6_1 {
	
	public static void main(String[] args) {
		mostrarDatos("Calos", 8.98);
	}
	
	public static void mostrarDatos (String alumno, double ... nota) {
		System.out.println("El alumno "+alumno+ " ha obtenido una calificación media de "+nota[0]);
	}
}