
public class Profesor {
	
	String nombre, asignatura;
	char situacion;
	int anioIngreso;
	double salarioBase;
	
	
	public Profesor() {}
	
	public Profesor(String nombre, String asignatura, char situacion, int anioIngreso, double salarioBase) {
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.situacion = situacion;
		this.anioIngreso = anioIngreso;
		this.salarioBase = salarioBase;
	}

	public int trienios(int anioActual) {
		int trienios;
		trienios=(anioActual-anioIngreso)/3;
		return trienios;
	}
	
	public void visualizarNomina (int anioActual) {
		
		double importeTrienios;
		
		if (situacion != 'F' && situacion != 'E') importeTrienios=0;
		else importeTrienios = (salarioBase*0.10)*trienios(anioActual);
		
		System.out.println("Profesor:"+nombre+"\nImporte:"+asignatura+"\nSueldo base:"+salarioBase+"Importe trienios:"+
	(salarioBase+importeTrienios));
	}
}
