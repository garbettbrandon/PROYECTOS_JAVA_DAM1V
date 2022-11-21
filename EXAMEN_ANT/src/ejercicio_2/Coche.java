package ejercicio_2;

import java.util.Date;

public class Coche extends Vehiculo {
	private String marca, modelo;
	private double largo;

	public Coche() {
	}

	public Coche(String matricula, Date fechaEntrada, String marca, String modelo, double largo) {
		super(matricula, fechaEntrada);
		this.marca = marca;
		this.modelo = modelo;
		this.largo = largo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "COCHE – matrícula: "+super.getMatricula()+" – Marca y modelo: "+getMarca()+" "+getModelo()+" – Largo: "+getLargo()+" metros";
	}

	public void calcularImporte() {
		double importe = 5 * largo;
		System.out.println("Total a pagar: " + importe);
	}
	
	public void pasarRevision() {
		if (marca.equalsIgnoreCase("Audi")) {
			System.out.println("Le faltan 5 años");
		}else if (marca.equalsIgnoreCase("BMW")) {
			System.out.println("Le faltan 6 años");
		}else {
			System.out.println("Le faltan 3 años");
		}
	}
}
