package P11_2;

import java.time.LocalDate;

public class Agua extends Congelado{
	private int gramosSalAgua;

	public Agua() {
	}

	public Agua(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado, int temperatura,
			int gramosSalAgua) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado, temperatura);
		this.gramosSalAgua = gramosSalAgua;
	}



	public int getGramosSalAgua() {
		return gramosSalAgua;
	}

	public void setGramosSalAgua(int gramosSalAgua) {
		this.gramosSalAgua = gramosSalAgua;
	}

	@Override
	public String toString() {
		return "Agua [gramosSalAgua=" + gramosSalAgua + ", getTemperatura()=" + getTemperatura() + ", toString()="
				+ super.toString() + "]";
	}
}
