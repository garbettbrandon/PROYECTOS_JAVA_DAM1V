package Ejemplo5_Interfaces;

public class Rectangulo implements FiguraGeometrica {
	public int ancho;
	public int alto;

	public Rectangulo() {}
	
	public Rectangulo(int ancho, int alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	
	@Override
	public boolean isLargerThan(FiguraGeometrica fg) {
		Rectangulo rc = (Rectangulo)fg;
		if(this.getArea()>rc.getArea()) return true;		
		return false;
	}
	
	
	public int getArea() {
		return ancho*alto;
	}
}
