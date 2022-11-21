package Ejemplo5_Interfaces;

public interface FiguraGeometrica {
	
	//método para ver si una figura es más grande que otra
	public boolean isLargerThan(FiguraGeometrica fg);
	
	default public void metodoPorDefecto() {
		System.out.println("Se ejecuta el método por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("El método estático se está ejecutando");
	}
}
