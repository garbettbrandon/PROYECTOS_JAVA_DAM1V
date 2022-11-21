package p12_2;

import java.util.*;

public class MainEmpleados {
	
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Empleado> listaEmple = new ArrayList<>(5);

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Brandon", "13232453", 1200);
		listaEmple.add(e1);
		Comercial c1 = new Comercial("David", "45643534634", 2000, 0);
		listaEmple.add(c1);
		Consultor cn1 = new Consultor("Enrique", "6557553443", 3000, 20, 30);
		listaEmple.add(cn1);
		Consultor cn2 = new Consultor("Sofia","847837483", 3400, 15, 50);
		listaEmple.add(cn2);
		
		listaEmple.forEach(System.out::println);
		System.out.println();
		
		eliminarEmple();
		listaEmple.forEach(System.out::println);
		System.out.println();
		
		buscarEmple();
		listaEmple.forEach(System.out::println);
		System.out.println();
		
		eliminarEmpleNombre();
		listaEmple.forEach(System.out::println);
		System.out.println();
		
		
		sustituirCuarto();
		listaEmple.forEach(System.out::println);
		System.out.println();
		
		
		recorrerIterator();
		System.out.println();
		
		//Volcar el arraylist en un array
		Object[] array = listaEmple.toArray();
		for (Object empleado : array) {
			System.out.println(empleado);
		}
		
		System.out.println("\n");
		
		//Ordenar el arrayList por nombre (orden alfabetico)
		Collections.sort(listaEmple, new Comparator<Empleado>() {
			   public int compare(Empleado obj1, Empleado obj2) {
			      return obj1.getNombre().compareTo(obj2.getNombre());
			   }
		});
		
		listaEmple.forEach(System.out::println);
	}
	
	private static void eliminarEmple() {
		System.out.println(" \n \n ELIMINAR EMPLEADO ");
		System.out.print(" Ingrese la posición del EMPLEADO: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaEmple.size()) {
			System.out.println(" Posición erronea ");
		} else {
			System.out.print(" ¿Está usted seguro de querer eliminar el EMPLEADO? (S / N): ");
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase("S")) {
				listaEmple.remove(posicion);
				System.out.println("EMPLEADO BORRADO");
			}else {
				System.out.println("Correo NO BORRADO!");
			}
		}
		System.out.println("\n");

	}

	private static void buscarEmple() {
		System.out.println(" \n \n BUSCAR EMPLEADO ");
		if (listaEmple.isEmpty()) {
			System.out.println(" No tienes empleados en la lista \n ");
		} else {
			System.out.print(" Ingrese el nombre del empleado: ");
			String nombre = sc.nextLine();
			for (int i = 0; i < listaEmple.size(); i++) {
				Empleado e = listaEmple.get(i);
				if (e.getNombre().equals(nombre)) {
					System.out.printf(" %d %s ", i, e.toString());
				}
			}
			System.out.println("\n");
		}
	}
	private static void eliminarEmpleNombre() {
		System.out.println(" \n \n ELIMINAR EMPLEADO ");
		System.out.print(" Ingrese EL NOMBRE del EMPLEADO: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < listaEmple.size(); i++) {
			Empleado e = listaEmple.get(i);
			if (e.getNombre().equals(nombre)) {
				listaEmple.remove(i);
				System.out.println("EMPLEADO BORRADO");
			}
		}
		System.out.println("\n");
	}
	private static void sustituirCuarto() {
		if (listaEmple.isEmpty()) {
			System.out.println(" No tienes empleados en la lista \n ");
		} else {
			for (int i = 0; i < listaEmple.size(); i++) {
				if (i==4) {
					Empleado eSustituto = new Empleado("Sustituto", "325577", 1200);
					listaEmple.add(4, eSustituto);
				}
			}
		}
		System.out.println("\n");
	}
	private static void recorrerIterator() {
		Iterator<Empleado> miIterator = listaEmple.iterator();
		while(miIterator.hasNext())
			  System.out.println(miIterator.next());
		
	}
}
