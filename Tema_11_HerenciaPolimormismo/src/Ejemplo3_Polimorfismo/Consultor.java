package Ejemplo3_Polimorfismo;

public class Consultor extends Empleado{
	private double numHoras;
	private double precioHora;
	
	public Consultor() {
		super();
	}
	
	public Consultor(String nombre, String nss, double sueldo, double numHoras, double precioHora) {
		super(nombre, nss, sueldo);
		this.numHoras = numHoras;
		this.precioHora = precioHora;
	}
	
	public double getNumHoras() {return numHoras;}
	public void setNumHoras(double numHoras) {this.numHoras = numHoras;}
	public double getPrecioHora() {	return precioHora;}
	public void setPrecioHora(double precioHora) {this.precioHora = precioHora;}
	
	@Override
	public String toString() {
		return "Consultor [numHoras=" + numHoras + ", precioHora=" + precioHora + "]";
	}
	
	public double calcularSueldo() {
		return super.calcularSueldo()+(numHoras*precioHora);
		
	}
	

}
