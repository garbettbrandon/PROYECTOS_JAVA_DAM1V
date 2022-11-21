package P11_1;

public class Trabajador extends Persona {
	//Atributos
	private char categoria;
	private int antiguedad;
	
	
	//Constructores
	public Trabajador() {
	}

	public Trabajador(String nombre, int edad, int telefono,char categoria, int antiguedad) {
		super(nombre, edad, telefono);
		this.categoria = categoria;
		this.antiguedad = antiguedad;
	}
	
	//Getters y Setters
	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	//Métodos
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+" Edad: "+getEdad()+" Telefono: "+getTelefono()+" Categoria: "+categoria+" Antiguedad: "+antiguedad;
	}
}
