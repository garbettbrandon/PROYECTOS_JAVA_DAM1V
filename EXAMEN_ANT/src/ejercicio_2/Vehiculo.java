package ejercicio_2;

import java.util.Date;

public abstract class Vehiculo {
	private String matricula;
	private Date fechaEntrada;
	
	public Vehiculo() {
	}

	public Vehiculo(String matricula, Date fechaEntrada) {
		this.matricula = matricula;
		this.fechaEntrada = fechaEntrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fechaEntrada=" + fechaEntrada + "]";
	}

}
