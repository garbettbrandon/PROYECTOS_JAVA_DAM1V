package p12_1;

import java.time.LocalDateTime;

public class Correo {
	private String origen, destino, asunto, cuerpo;
	private LocalDateTime fecha;
	
	public Correo() {
	}
	
	public Correo(String origen, String destino, String asunto, String cuerpo, LocalDateTime fecha) {
		this.origen = origen;
		this.destino = destino;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.fecha = fecha;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Correo [origen=" + origen + ", destino=" + destino + ", asunto=" + asunto + ", cuerpo=" + cuerpo
				+ ", fecha=" + fecha + "]";
	}
	
}