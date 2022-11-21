package Ejemplo3_Polimorfismo;

public class Comercial extends Empleado {
	private double comision;
	private double ventas;

	public Comercial() {
		super();
	}

	public Comercial(String nombre, String nss, double sueldo, double ventas, double comision) {
		super(nombre, nss, sueldo);
		this.comision = comision;
		this.ventas=ventas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	
	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Comercial [comision=" + comision + "]";
	}
	
	
	public double calcularSueldo() {
		return super.calcularSueldo()+(ventas*comision)/100;
	}
	

}
