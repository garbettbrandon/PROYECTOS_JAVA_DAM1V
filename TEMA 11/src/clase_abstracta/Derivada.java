package clase_abstracta;

public class Derivada extends ClaseAbstracta{
	
	public Derivada (String nombrePersona) {
		nombrePersona = super.nombrePersona;
	}
	
	//implementar el metodo saludar
	@Override
	public void saludar() {
		System.out.println("Hola "+nombrePersona);
	}
}
