package p12_2;

public class Empleado {
	private String nombre, nSS;
	private double sueldoBase;
	
	public Empleado() {
	}

	public Empleado(String nombre, String nSS, double sueldoBase) {
		this.nombre = nombre;
		this.nSS = nSS;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnSS() {
		return nSS;
	}

	public void setnSS(String nSS) {
		this.nSS = nSS;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+", Numero SS: "+nSS+", Sueldo Base: "+sueldoBase;
	}
	
	public double calcularSueldo() {
		double sueldo = getSueldoBase();
		return sueldo;
	}
	
	
}
