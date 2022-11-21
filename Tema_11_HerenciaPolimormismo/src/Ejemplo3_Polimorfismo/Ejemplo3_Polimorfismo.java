package Ejemplo3_Polimorfismo;

public class Ejemplo3_Polimorfismo {

	public static void main(String[] args) {
		Empleado trabajador1;
		Empleado consultor1;
		Empleado comercial1;
		
		trabajador1 = new Empleado("Pedor López","3939949493SS",1680.5);
		consultor1 = new Consultor("Laura García","382720284SS",2200.5,24.0,25);
		comercial1 = new Comercial("Luis Pérez","555550284SS",1800.5,18560421,1.0);
		
		saludar(trabajador1);
		saludar(consultor1);
		saludar(comercial1);
		
		mostrarNombreYPaga(trabajador1);
		mostrarNombreYPaga(consultor1);
		mostrarNombreYPaga(comercial1);
		
	}
	
	public static void saludar(Empleado e) {
		System.out.println("Buenos días sr./sra "+ e.getNombre());
	}
	
	public static void mostrarNombreYPaga(Empleado e) {
		System.out.printf("El sueldo base del emplead@ %s es %.2f y su sueldo final es %.2f%n"
				,e.getNombre(),e.getSueldo(),e.calcularSueldo());
	}

}
