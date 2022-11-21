package p11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Administrador extends Persona{
	private String codigoAdmin, finca;
	private int numVecinos;
	private float salario;
	
	public Administrador() {
		super();
	}

	public Administrador(String nombre, String dni, int edad, String codigoAdmin, String finca, int numVecinos,
			float salario) {
		super(nombre, dni, edad);
		this.codigoAdmin = codigoAdmin;
		this.finca = finca;
		this.numVecinos = numVecinos;
		this.salario = salario;
	}

	public String getCodigoAdmin() {
		return codigoAdmin;
	}

	public void setCodigoAdmin(String codigoAdmin) {
		this.codigoAdmin = codigoAdmin;
	}

	public String getFinca() {
		return finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	public int getNumVecinos() {
		return numVecinos;
	}

	public void setNumVecinos(int numVecinos) {
		this.numVecinos = numVecinos;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Administrador [codigoAdmin=" + codigoAdmin + ", finca=" + finca + ", numVecinos=" + numVecinos
				+ ", salario=" + salario + ", toString()=" + super.toString() + "]";
	}
	
	public boolean codigoValido (String cod) {
		Pattern patron = Pattern.compile("[A-a][0-9]{5}");
        Matcher mat = patron.matcher(cod);
        if(!mat.matches()){
           System.out.println("El codigo introducido es incorrecto, por favor introduzca un codigo válido.");
           return false;
        }
        System.out.println("El codigo " + cod + " es válido.");
		return true;
	}
	
	public double salarioMax(double c) {
		double salMax = (numVecinos*c)/2;
		return salMax;
	}
	
}
