package ejemplos;

public class Triangulo extends Figura{
	//Atributos
	private String tipo;
	
	//Constructores
	public Triangulo(double ancho, double alto, String tipo) {
		super(ancho, alto);
		this.tipo = tipo;
	}
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	//Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Métodos
	public double area() {
		return (getAncho() * getAlto())/2;
	}
	
	public void mostrarEstilo() {
		System.out.println("El triangulo es de tipo "+tipo);
	}

	@Override
	public String toString() {
		return "Triangulo --> Tipo: "+tipo+", Ancho: " +getAncho()+", Alto: "+getAlto();
	}

}
