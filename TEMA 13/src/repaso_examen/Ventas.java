package repaso_examen;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ventas {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Venta> miLista = new ArrayList<>();

	public static void main(String[] args) {
		try (RandomAccessFile fVentas = new RandomAccessFile("C:/Users/brand/Desktop/ventas/VentasMayo.dat", "rw")) {

			// Metodo capturar ventas
			registrarVentas(fVentas);
			// Metodo visualizar fichero
			visualizarfichero(fVentas);
			// Generar informe ventas Mayo
			//informeVentas(fVentas);
			// pasar a un array list
			//pasoArrayList(fVentas);
			//informeArrayList();
			generarFicheroErrores(fVentas);

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero en el directorio indicado");
		} catch (IOException e1) {
			System.out.println("Error E/S");
		}
	}

	public static void informeArrayList() {
		
		int codigoNuevo = 0;
		int codigoCliente = 0;
		double importe, totalVentasCliente = 0, ventasTarjeta = 0, ventasErroneo = 0, ventasMetalico = 0,
				totalVentasMes = 0;
		char formaPago;
		
		

		for (int i = 0; i < miLista.size(); i++) {

			codigoCliente = miLista.get(i).getCodigo();
			codigoNuevo = codigoCliente;

			while (codigoNuevo == codigoCliente) {
				
				importe = miLista.get(i).getImporteVenta();
				totalVentasCliente += importe;
				formaPago = miLista.get(i).getFormaPago();
				
				switch (formaPago) {
				case 'M':
					ventasMetalico += importe;
					break;
				case 'C':
					ventasTarjeta += importe;
					break;
				default:
					ventasErroneo += importe;
				}
				codigoNuevo = 1;
			}
			
			System.out.printf("Cliente: %S Ventas Totales: %.2f \n", codigoCliente, totalVentasCliente);
			totalVentasMes += totalVentasCliente;
			totalVentasCliente = 0;
			codigoCliente = codigoNuevo;
		}
		System.out.printf("Ventas Totales Mes: %.2f \n", totalVentasMes);
		System.out.printf("Total ventas tarjeta: %.2f\nTotal ventas metálico: %.2f\nTotal ventas pago erroneo: %.2f \n",
				ventasTarjeta, ventasMetalico, ventasErroneo);
	}

	public static void generarFicheroErrores(RandomAccessFile fVentas) throws IOException {
		try (RandomAccessFile fErrores = new RandomAccessFile("C:/Users/brand/Desktop/Errores.txt", "rw")) {
			fVentas.seek(0);
			int cliente = fVentas.readInt();
			while (true) {
				double importe = fVentas.readDouble();
				char formaPago = fVentas.readChar();
				if (formaPago != 'C' && formaPago != 'M') {
					fErrores.writeInt(cliente);
					fErrores.writeDouble(importe);
				}
				cliente = fVentas.readInt();
			}
		} catch (EOFException e) {
			System.out.println("Final del fichero");
		}
		
		FileReader f = new FileReader("C:/Users/brand/Desktop/Errores.txt");
		int linea =0;
		while (linea != -1) {
			linea = f.read();
			System.out.println( linea);
		}
		f.close();
	}

	public static void pasoArrayList(RandomAccessFile fVentas) throws IOException {
		fVentas.seek(0);
		try {
			while (true) {
				miLista.add(new Venta(fVentas.readInt(), fVentas.readDouble(), fVentas.readChar()));
			}
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		}
	}

	public static void informeVentas(RandomAccessFile fVentas) throws IOException {
		fVentas.seek(0);
		int codigoCliente = 0, codigoNuevo;
		double totalVentasMes = 0, totalVentasCliente = 0;
		double ventasTarjeta = 0, ventasMetalico = 0, ventasErroneo = 0, importe = 0;
		char formaPago;
		try {
			codigoCliente = fVentas.readInt();
			codigoNuevo = codigoCliente;
			while (true) {
				// while(fVentas.getFilePointer()<fVentas.length())
				while (codigoNuevo == codigoCliente) {
					importe = fVentas.readDouble();
					totalVentasCliente += importe;
					formaPago = fVentas.readChar();
					switch (formaPago) {
					case 'M':
						ventasMetalico += importe;
						break;
					case 'C':
						ventasTarjeta += importe;
						break;
					default:
						ventasErroneo += importe;
					}
					codigoNuevo = fVentas.readInt();
				}
				System.out.printf("Cliente: %S Ventas Totales: %.2f \n", codigoCliente, totalVentasCliente);
				totalVentasMes += totalVentasCliente;
				totalVentasCliente = 0;
				codigoCliente = codigoNuevo;
			}
		} catch (EOFException e) {
			System.out.printf("Cliente: %S Ventas Totales: %.2f \n", codigoCliente, totalVentasCliente);
			totalVentasMes += totalVentasCliente;
			System.out.printf("Ventas Totales Mes: %.2f \n", totalVentasMes);
			System.out.printf(
					"Total ventas tarjeta: %.2f\nTotal ventas metálico: %.2f\nTotal ventas pago erroneo: %.2f \n",
					ventasTarjeta, ventasMetalico, ventasErroneo);
		}

	}

	public static void visualizarfichero(RandomAccessFile fVentas) throws IOException {
		fVentas.seek(0);
		try {
			while (true) {
				// System.out.print("Puntero: " + fVentas.getFilePointer());
				System.out.printf("%d\t%.2f\t%S\n", fVentas.readInt(), fVentas.readDouble(), fVentas.readChar());
			}
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		}
	}

	public static void registrarVentas(RandomAccessFile fVentas) throws IOException {
		int numCliente;
		double importeVenta;
		char formaPago;

		// Para ir al final
		// fVentas.seek(fVentas.length());

		try {
			System.out.print("Introduce el numero de cliente: ");
			numCliente = sc.nextInt();
			sc.nextLine();

			while (numCliente != 0) {
				System.out.print("Introduce el importe de la venta: ");
				importeVenta = sc.nextDouble();
				sc.nextLine();
				System.out.print("Introduce la forma de pago: ");
				formaPago = sc.next().charAt(0);

				System.out.print("Puntero: " + fVentas.getFilePointer() + "\n");

				fVentas.writeInt(numCliente);
				fVentas.writeDouble(importeVenta);
				fVentas.writeChar(formaPago);

				System.out.print("Introduce el numero de cliente: ");
				numCliente = sc.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("Dato erroneo introducido");
		}
	}
}
