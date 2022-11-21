package P11_2;

import java.time.LocalDate;

public class Fresco extends Producto{
	
	public Fresco() {}

	public Fresco(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado);
	}

	@Override
	public String toString() {
		return "Fresco [toString()=" + super.toString() + "]";
	}
}
