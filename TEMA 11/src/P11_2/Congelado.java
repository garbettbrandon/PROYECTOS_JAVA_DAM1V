package P11_2;

import java.time.LocalDate;

public class Congelado extends Producto{
	private int temperatura;

	public Congelado() {
	}

	public Congelado(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado, int temperatura) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Congelado [temperatura=" + temperatura + ", toString()=" + super.toString() + "]";
	}
	
}
