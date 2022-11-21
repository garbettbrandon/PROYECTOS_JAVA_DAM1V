package p11_6;

public abstract class Maquina {
	//Atributos
	private int numSerie, horasFun;
	private String modelo;
	
	//Getters & Setters
	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public int getHorasFun() {
		return horasFun;
	}

	public void setHorasFun(int horasFun) {
		this.horasFun = horasFun;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Constructores
	public Maquina() {
	}
	
	public Maquina(int numSerie, int horasFun, String modelo) {
		this.numSerie = numSerie;
		this.horasFun = horasFun;
		this.modelo = modelo;
	}
	
	//Metodos
	public abstract void encender();
	public abstract void apagar();
}
