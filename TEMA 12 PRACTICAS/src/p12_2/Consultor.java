package p12_2;

public class Consultor extends Empleado{
	private double precioHora;
	private int numHoras;
	
	public Consultor() {
	}

	public Consultor(double precioHora, int numHoras) {
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}

	public Consultor(String nombre, String nSS, double sueldoBase, double precioHora, int numHoras) {
		super(nombre, nSS, sueldoBase);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return super.toString()+" , Precio Hora: "+precioHora+", Horas: "+numHoras;
	}

	
	
	
}
