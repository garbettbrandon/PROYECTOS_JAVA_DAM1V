package p12_3;

import java.util.*;

public class MainPaisesCapitales {
	public static void main(String[] args) {
		
		LinkedList<String> listaPaises = new LinkedList<>();
		listaPaises.add("Francia");
		listaPaises.add("España");
		listaPaises.add("Inglaterra");
		listaPaises.add("Alemania");
		listaPaises.add("Italia");
		
		LinkedList<String> listaCapitales = new LinkedList<>();
		listaCapitales.add("Paris");
		listaCapitales.add("Madrid");
		listaCapitales.add("Londres");
		listaCapitales.add("Berlin");
		listaCapitales.add("Roma");
		
		System.out.println(listaPaises);
		System.out.println(listaCapitales);
		
		ListIterator<String> itA = listaPaises.listIterator();
		ListIterator<String> itB = listaCapitales.listIterator();
		
		while (itB.hasNext()) {
			if (itA.hasNext()) {
				itA.next();
			}
			itA.add(itB.next());
		}
		System.out.println(listaPaises);
		
		itB=listaCapitales.listIterator();
		
		while (itB.hasNext()) {
			itB.next();
			if (itB.hasNext()) {
				itB.next();
				itB.remove();
			}
		}
		
		System.out.println(listaCapitales);
		
		listaPaises.removeAll(listaCapitales);
		System.out.println(listaPaises);
		
		Collections.sort(listaPaises);
		System.out.println(listaPaises);
		
		ArrayList<String> list = new ArrayList<String>(listaPaises);
		
		for (String string : list) {
			System.out.print("  "+string);
		}
		
	}
}
