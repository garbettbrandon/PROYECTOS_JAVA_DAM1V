package clase_abstracta;

public abstract class ClaseAbstracta {

	public String nombrePersona;

	
	
	//Constructor inutil
	public ClaseAbstracta() {}
	
	
	
	//Metodo normal saludo
	public void saludo () {
		System.out.println("Hola Mundo!");
	}
	
	//Metodo abstracto saludar
	public abstract void saludar();
}