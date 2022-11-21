package practica_9_4;

public class UsoAparatoElectrico {

	public static void main(String[] args) {
		AparatoElectrico bombilla = new AparatoElectrico(150,false);
		AparatoElectrico plancha = new AparatoElectrico(2000, false);
		AparatoElectrico.setConsumoTotal(0);
		System.out.println("El consumo total de los aparatos es: "+AparatoElectrico.getConsumoTotal()+" Watios");
		
		bombilla.encender();
		System.out.println("El consumo total de los aparatos es: "+AparatoElectrico.getConsumoTotal()+" Watios");
		
		plancha.encender();
		System.out.println("El consumo total de los aparatos es: "+AparatoElectrico.getConsumoTotal()+" Watios");
		
		bombilla.apagar();
		System.out.println("El consumo total de los aparatos es: "+AparatoElectrico.getConsumoTotal()+" Watios");
	}
	
}