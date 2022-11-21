package p11_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vecino extends Persona{
	private String codigoVecino, codVivienda, finca;
	private static double cuota;
	
	public Vecino() {
		super();
	}

	public Vecino(String nombre, String dni, int edad, String codigoVecino, String cosVivienda, String finca) {
		super(nombre, dni, edad);
		this.codigoVecino = codigoVecino;
		this.codVivienda = cosVivienda;
		this.finca = finca;
	}

	public Vecino(String nombre, int edad, String codigoVecino, String cosVivienda, String finca) {
		super(nombre, edad);
		this.codigoVecino = codigoVecino;
		this.codVivienda = cosVivienda;
		this.finca = finca;
	}

	public String getCodigoVecino() {
		return codigoVecino;
	}

	public void setCodigoVecino(String codigoVecino) {
		this.codigoVecino = codigoVecino;
	}

	public String getCosVivienda() {
		return codVivienda;
	}

	public void setCosVivienda(String cosVivienda) {
		this.codVivienda = cosVivienda;
	}

	public String getFinca() {
		return finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	public static double getCuota() {
		return cuota;
	}

	public static void setCuota(double cuota) {
		Vecino.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Vecino [codigoVecino=" + codigoVecino + ", cosVivienda=" + codVivienda + ", finca=" + finca
				+ ", toString()=" + super.toString() + "]";
	}
	
	public boolean codigoValido(String cod) {
		 Pattern patron = Pattern.compile("[V-v][0-9]{5}");
	        Matcher mat = patron.matcher(cod);
	        if(!mat.matches()){
	           System.out.println("El codigo introducido es incorrecto, por favor introduzca un codigo válido.");
	           return false;
	        }
	        System.out.println("El codigo " + cod + " es válido.");
			return true;
	}
	
	public void modifCuota(double nuevaCuota) {
		cuota = nuevaCuota;
	}
}
