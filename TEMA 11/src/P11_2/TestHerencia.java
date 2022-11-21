package P11_2;

import java.time.LocalDate;

public class TestHerencia {

	public static void main(String[] args) {
		Fresco platano = new Fresco(LocalDate.of(2022, 6, 10), 123, "España",LocalDate.of(2022, 3, 10));
		Fresco sandia = new Fresco(LocalDate.of(2022, 6, 10), 124, "Brasil", LocalDate.of(2022, 6, 10));
		
		Refrigerado leche = new Refrigerado(LocalDate.of(2022, 6, 10), 125, "España", LocalDate.of(2022, 3, 10), 333, 10);
		Refrigerado queso = new Refrigerado(LocalDate.of(2022, 6, 10), 126, "España", LocalDate.of(2022, 3, 10), 333, 8);
		Refrigerado jamon = new Refrigerado(LocalDate.of(2022, 6, 10), 127, "España", LocalDate.of(2022, 3, 10), 333, 15);
		
		Agua hielo = new Agua(LocalDate.of(2022, 6, 10), 128, "España",LocalDate.of(2022, 3, 10), -5, 2);
		Agua helado = new Agua(LocalDate.of(2022, 6, 10), 129, "Finlandia", LocalDate.of(2022, 3, 10), -8, 3);
		
		Aire ventresca = new Aire(LocalDate.of(2022, 6, 10), 130, "Turquia", LocalDate.of(2022, 3, 10), -8, 5, 10, 5, 5);
		Aire guisantes = new Aire(LocalDate.of(2022, 6, 10), 131, "Marruecos", LocalDate.of(2022, 3, 10), -5, 5, 10, 5, 5);
		
		Nitrogeno frambuesas = new Nitrogeno(LocalDate.of(2022, 6, 10), 132, "Suiza", LocalDate.of(2022, 3, 10), -8, "congelación criogénica", 30);
		
		System.out.println(platano.toString());
		System.out.println(sandia.toString());
		System.out.println(leche.toString());
		System.out.println(queso.toString());
		System.out.println(jamon.toString());
		System.out.println(hielo.toString());
		System.out.println(helado.toString());
		System.out.println(ventresca.toString());
		System.out.println(guisantes.toString());
		System.out.println(frambuesas.toString());
	}

}
