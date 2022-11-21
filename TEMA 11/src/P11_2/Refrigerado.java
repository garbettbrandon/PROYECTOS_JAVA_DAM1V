package P11_2;

import java.time.LocalDate;

public class Refrigerado extends Producto{
	private int codOrg;
	private int temperatura;
	
	public Refrigerado() {
	}

	public Refrigerado(LocalDate fechaCad, int numLote, String paisOrigen, LocalDate fechaEnvasado, int codOrg,
			int temperatura) {
		super(fechaCad, numLote, paisOrigen, fechaEnvasado);
		this.codOrg = codOrg;
		this.temperatura = temperatura;
	}

	public int getCodOrg() {
		return codOrg;
	}

	public void setCodOrg(int codOrg) {
		this.codOrg = codOrg;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Refrigerado [codOrg=" + codOrg + ", temperatura=" + temperatura + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
