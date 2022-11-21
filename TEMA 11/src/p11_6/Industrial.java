package p11_6;

public class Industrial extends Maquina{
	//Atributos
	public int potenciaConsumo;

	//Constructores
	public Industrial() {
		super();
	}
	
	public Industrial(int numSerie, int horasFun, String modelo, int potenciaConsumo) {
		super(numSerie, horasFun, modelo);
		this.potenciaConsumo = potenciaConsumo;
	}
	
	//Getters & Setters
	public int getPotenciaConsumo() {
		return potenciaConsumo;
	}

	public void setPotenciaConsumo(int potenciaConsumo) {
		this.potenciaConsumo = potenciaConsumo;
	}

	//Métodos
	@Override
	public void encender() {
		System.out.println("El objeto Industrial está encendido");
	}
	
	@Override
	public void apagar() {
		System.out.println("El objeto Industrial está encendido");
	}

}
