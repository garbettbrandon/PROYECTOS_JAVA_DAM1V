package pruebaStatic;

public class Bicicleta {
	private int id;
	private int diametroRueda;
	private int numMarchas;
	
	private static int numBicis;

	public Bicicleta(int id, int diametroRueda, int numMarchas) {
		this.id = id;
		this.diametroRueda = diametroRueda;
		this.numMarchas = numMarchas;
	}

	public Bicicleta() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiametroRueda() {
		return diametroRueda;
	}

	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public static int getNumBicis() {
		return numBicis;
	}

	public static void setNumBicis(int numBicis) {
		Bicicleta.numBicis = numBicis;
	}

	@Override
	public String toString() {
		return "Bicicleta [id=" + id + ", diametroRueda=" + diametroRueda + ", numMarchas=" + numMarchas + "]";
	}
	
	public static void probarStatic (int variable) {
		System.out.println(variable);
		System.out.println(numBicis);
	}
}
