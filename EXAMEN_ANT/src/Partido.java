
public class Partido {
	private String equipoL;
	private String equivoV;
	private int golesL;
	private int golesV;
		
	public Partido() {
	}

	public Partido(String equipoL, String equivoV, int golesL, int golesV) {
		this.equipoL = equipoL;
		this.equivoV = equivoV;
		this.golesL = golesL;
		this.golesV = golesV;
	}

	public String getEquipoL() {
		return equipoL;
	}

	public void setEquipoL(String equipoL) {
		this.equipoL = equipoL;
	}

	public String getEquivoV() {
		return equivoV;
	}

	public void setEquivoV(String equivoV) {
		this.equivoV = equivoV;
	}

	public int getGolesL() {
		return golesL;
	}

	public void setGolesL(int golesL) {
		this.golesL = golesL;
	}

	public int getGolesV() {
		return golesV;
	}

	public void setGolesV(int golesV) {
		this.golesV = golesV;
	}

	@Override
	public String toString() {
		return "Partido [equipoL=" + equipoL + ", equivoV=" + equivoV + ", golesL=" + golesL + ", golesV=" + golesV
				+ "]";
	}
}
