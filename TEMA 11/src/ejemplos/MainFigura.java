package ejemplos;

public class MainFigura {

	public static void main(String[] args) {
		Figura fg2 = new Figura(5.5,10.2);
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo(2.5,1.9,"Isósceles");

		t1.setAncho(10.5);
		t1.setTipo("Escaleno");
		fg2.setAncho(5.5);
		t2.getAlto();
		System.out.println(t2);
		System.out.println(t1);
		
		System.out.println("Comparación t1 y t2: "+t1.equals(t2));
	}
}
