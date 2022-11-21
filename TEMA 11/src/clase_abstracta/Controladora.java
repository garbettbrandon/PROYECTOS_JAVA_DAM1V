package clase_abstracta;

public class Controladora {

	public static void main(String[] args) {
		Derivada der = new Derivada("Maria");
		ClaseAbstracta der2 = new Derivada("Brandon");
		
		der.saludo();
		der2.saludar();
	}

}
