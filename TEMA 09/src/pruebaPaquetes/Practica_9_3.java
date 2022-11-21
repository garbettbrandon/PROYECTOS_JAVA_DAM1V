package pruebaPaquetes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import productos.Productos;
import vendedores.Vendedor;

public class Practica_9_3 {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos del v1: ");
		System.out.print("Numero de vendedor: ");
		String numero = sc.nextLine();
		v1.setNumeroVendedor(numero);
		System.out.print("Nombre del v1: ");
		String nombre = sc.nextLine();
		v1.setNombre(nombre);
		System.out.print("Introduzca la fecha de contrato con formato dd/mm/yyyy: ");
        String fecha = sc.nextLine();
        while (stringToLocalDate(fecha) == null) {
        	System.out.print("Fecha invalida, prueba otra vez: ");
            fecha = sc.nextLine();
        }
        LocalDate fechaLocal = stringToLocalDate(fecha);
        v1.setFechaALta(fechaLocal);
        System.out.print("Introduzca la comision del v1: ");
        double comm = sc.nextDouble();
        v1.setComision(comm);
        sc.close();
        
        System.out.println("Los datos del primer empleado son: "+v1.toString());
        
        Vendedor v2 = new Vendedor("1234", "Brandon", LocalDate.of(2020, 02, 22), 300.16);
        
        System.out.println("Los datos del segundo empleado son: "+v2.toString());
        
        Productos [] vectorProductos = new Productos[5];
		vectorProductos[0]= new Productos("3545", "Aceite", 12.50, 40, 9);
		vectorProductos[1]= new Productos("3546", "Agua", 2.50, 50, 0);
		vectorProductos[2]= new Productos("3547", "Banana", 1.50, 43, 2);
		vectorProductos[3]= new Productos("3548", "CocaCola", 2.00, 100, 40);
		vectorProductos[4]= new Productos("3540", "Coco", 0.50, 10,0);
	}
	public static LocalDate stringToLocalDate(String fecha) {
	    final DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	    LocalDate fechaLocal;
	    fechaLocal = LocalDate.parse(fecha, formateo);

	    return fechaLocal;
	}
}
