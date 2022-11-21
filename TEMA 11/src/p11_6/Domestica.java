package p11_6;

public class Domestica extends Maquina{
	
	//Constructores
	public Domestica() {
		super();
	}

	public Domestica(int numSerie, int horasFun, String modelo) {
		super(numSerie, horasFun, modelo);
	}

	//Metodos
	@Override
	public void encender() {
		System.out.println("El objeto Domestica está encendido");
	}

	@Override
	public void apagar() {
		System.out.println("EL objeto Domestica está apagado");
	}
	
}
