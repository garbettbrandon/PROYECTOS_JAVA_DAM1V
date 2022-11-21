package p12_2;

public class Comercial extends Empleado{
	private int comision;

	public Comercial(int comision) {
		this.comision = comision;
	}
	
	
	public Comercial(String nombre, String nSS, double sueldoBase, int comision) {
		super(nombre, nSS, sueldoBase);
		this.comision = comision;
	}



	public Comercial() {
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}


	
	@Override
	public String toString() {
		return super.toString()+" , Comision: "+comision;
	}


	public double calcularSueldo() {
		double sueldo=getSueldoBase()+getComision();
		return sueldo;
	}
	
	
}
