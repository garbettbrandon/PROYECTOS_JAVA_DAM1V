package P11_2;

import java.time.LocalDate;

public class Aire extends Congelado{
	private int porcenN, porcenO2, porcenCO2, porcenVapor;

	public Aire() {
	}

	public Aire(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado, int temperatura,
			int porcenN, int porcenO2, int porcenCO2, int porcenVapor) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado, temperatura);
		this.porcenN = porcenN;
		this.porcenO2 = porcenO2;
		this.porcenCO2 = porcenCO2;
		this.porcenVapor = porcenVapor;
	}
	
	public int getPorcenN() {
		return porcenN;
	}

	public void setPorcenN(int porcenN) {
		this.porcenN = porcenN;
	}

	public int getPorcenO2() {
		return porcenO2;
	}

	public void setPorcenO2(int porcenO2) {
		this.porcenO2 = porcenO2;
	}

	public int getPorcenCO2() {
		return porcenCO2;
	}

	public void setPorcenCO2(int porcenCO2) {
		this.porcenCO2 = porcenCO2;
	}

	public int getPorcenVapor() {
		return porcenVapor;
	}

	public void setPorcenVapor(int porcenVapor) {
		this.porcenVapor = porcenVapor;
	}

	@Override
	public String toString() {
		return "Aire [porcenN=" + porcenN + ", porcenO2=" + porcenO2 + ", porcenCO2=" + porcenCO2 + ", porcenVapor="
				+ porcenVapor + ", getTemperatura()=" + getTemperatura() + ", toString()=" + super.toString() + "]";
	}
}
