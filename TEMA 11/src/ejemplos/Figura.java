package ejemplos;

public class Figura {
	//Atributos
	private double ancho, alto;
	
	//Constructores
	public Figura(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	public Figura() {}
	
	//Getters y Setters
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	//Métodos
	public void mostrarDimension () {
		System.out.println("La figura tiene un ancho de "+ancho+" y un alto de "+alto);
	}
	
}
