package P11_2;

import java.time.LocalDate;

public class Producto {
	//Atributos
	private LocalDate fechaCad;
	private int numLote;
	private String paisOrigen;
	private LocalDate fechaEnvasado;
	
	public Producto() {}
	
	public Producto(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado) {
		super();
		this.fechaCad = fechaCad;
		this.numLote = numLote;
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}

	@Override
	public String toString() {
		return "Producto [fechaCad=" + fechaCad + ", numLote=" + numLote + ", paisOrigen=" + paisOrigen
				+ ", fechaEnvasado=" + fechaEnvasado + "]";
	}
}
