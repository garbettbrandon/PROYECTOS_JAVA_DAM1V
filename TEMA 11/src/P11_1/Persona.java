package P11_1;

public class Persona {
	//Atributos
	private String nombre;
	private int edad, telefono;

	//Constructores
	public Persona() {}

	public Persona(String nombre, int edad, int telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
}
