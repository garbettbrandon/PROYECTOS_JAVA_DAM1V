package p11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
	private String nombre, dni;
	private int edad;
	
	public Persona() {}

	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	public boolean esMayorDeEdad(int e) {
		if (edad > 18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean dniValido(String dni) {
        Pattern patron = Pattern.compile("[0-9]{8}[A-Z a-z]");
        Matcher mat = patron.matcher(dni);
        while(!mat.matches()){
           System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
           return false;
        }
        System.out.println("El DNI " + dni + " es válido.");
		return true;
	}
}
