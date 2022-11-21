package ejercicio_2;

import java.util.Date;

public class Camion extends Vehiculo {
	private int numRuedas;

	public Camion() {
	}

	public Camion(String matricula, Date fechaEntrada, int numRuedas) {
		super(matricula, fechaEntrada);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "CAMIÓN – matrícula: "+super.getMatricula()+" – Número de ruedas: "+getNumRuedas();
	}

	public void calcularImporte() {
		double importe = 5 * numRuedas;
		System.out.println("Total a pagar: " + importe);
	}
}
