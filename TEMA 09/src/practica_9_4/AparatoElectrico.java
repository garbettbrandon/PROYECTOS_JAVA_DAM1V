package practica_9_4;

public class AparatoElectrico {
	private int potencia;
	private boolean encendido;
	private static double consumoTotal;

	
	public AparatoElectrico() {
	}	
	public AparatoElectrico(int potencia, boolean encendido) {
		this.potencia = potencia;
		this.encendido = encendido;
	}


	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	public static double getConsumoTotal() {
		return consumoTotal;
	}
	public static void setConsumoTotal(double consumoTotal) {
		AparatoElectrico.consumoTotal = consumoTotal;
	}
	public void encender() {
		encendido=true;
		consumoTotal+=potencia;
	}
	public void apagar() {
		if (encendido) {
			consumoTotal-=potencia;
			encendido=false;
		}
	}
}
