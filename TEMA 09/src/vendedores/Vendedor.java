package vendedores;

import java.time.LocalDate;

public class Vendedor {
	private String numeroVendedor, nombre;
	private LocalDate fechaALta;
	private double comision;

	public Vendedor() {
	}

	public Vendedor(String numeroVendedor, String nombre, LocalDate fechaALta, double comision) {
		this.numeroVendedor = numeroVendedor;
		this.nombre = nombre;
		this.fechaALta = fechaALta;
		this.comision = comision;
	}

	public String getNumeroVendedor() {
		return numeroVendedor;
	}

	public void setNumeroVendedor(String numeroVendedor) {
		this.numeroVendedor = numeroVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaALta() {
		return fechaALta;
	}

	public void setFechaALta(LocalDate fechaALta) {
		this.fechaALta = fechaALta;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [numeroVendedor=" + numeroVendedor + ", nombre=" + nombre + ", fechaALta=" + fechaALta
				+ ", comision=" + comision + "]";
	}

}
