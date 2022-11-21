package practica_9_2_extra;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
	private String nombre;
	private double sueldo;
	private String nif;
	private int numHijos;
	private Calendar fechaContrato;

	
	public Empleado() {
	}
	
	public Empleado(String nombre, double sueldo, int numHijos, GregorianCalendar fechaContrato) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numHijos = numHijos;
		this.fechaContrato = fechaContrato;
	}
	
	public Calendar getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Calendar fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

@Override
	public String toString() {
		return "Nombre: " +nombre+"\nSueldo: "+sueldo+"\nNif: "+nif+"\nNumHijos: "+numHijos
				+"\nFechaContrato: "+fechaContrato;
	}

	//Metodos Creados
	public void subirSueldo(double incremento) {
		this.setSueldo((incremento * sueldo) + sueldo);
	}
	public double sueldoNeto() {
		double sueldoNeto = 0, irpf = 0;
		if (sueldo <= 1000)
			irpf = 6.12;
		else if (sueldo <= 1400)
			irpf = 11.8;
		else if (sueldo <= 2900)
			irpf = 20.03;
		else
			irpf = 25;

		irpf -= disminucionHijos();
		sueldoNeto = sueldo - sueldo * irpf / 100;

		return sueldoNeto;

	}
	public double disminucionHijos() {
		double disminucion = 0;

		switch (numHijos) {
		case 0:
			disminucion = 0;
			break;
		case 1:
			disminucion = 1;
			break;
		case 2:
			disminucion = 4;
			break;
		default:
			disminucion = 7;
		}

		return disminucion;
	}
	public void imprimirNomina() {
		// Visualizar nomina
		System.out.printf("NOMINA DE %S \n", nombre);
		System.out.println("Sueldo Bruto: " + sueldo);
		System.out.printf("            IRPF : %.2f \n", (sueldo - sueldoNeto()));
		System.out.printf("            SUELDO NETO : %.2f \n",sueldoNeto());
	}

}