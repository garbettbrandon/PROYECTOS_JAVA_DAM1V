package P11_2;

import java.time.LocalDate;

public class Nitrogeno extends Congelado{
	private String metodo;
	private int segExp;
	
	public Nitrogeno() {
	}

	public Nitrogeno(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado, int temperatura,
			String metodo, int segExp) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado, temperatura);
		this.metodo = metodo;
		this.segExp = segExp;
	}
	
	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public int getSegExp() {
		return segExp;
	}

	public void setSegExp(int segExp) {
		this.segExp = segExp;
	}

	@Override
	public String toString() {
		return "Nitrogeno [metodo=" + metodo + ", segExp=" + segExp + ", getTemperatura()=" + getTemperatura()
				+ ", toString()=" + super.toString() + "]";
	}
}
