package pruebaStatic;

public class UsoBicicleta {
	public static void main(String[] args) {

		Bicicleta.setNumBicis(1);
		Bicicleta.probarStatic(10);
		
		int id = Bicicleta.getNumBicis();
		
		Bicicleta bici1 = new Bicicleta (id,55,7);
		Bicicleta.setNumBicis(id + 1);
		
		System.out.println(bici1.toString());
		
		id = Bicicleta.getNumBicis();
		
		Bicicleta bici2 = new Bicicleta (id,53,7);
		Bicicleta.setNumBicis(id + 1);
		
		System.out.println(bici2.toString());
		
		//bici2.setNumBicis(5);
		
		System.out.println(Bicicleta.getNumBicis());
		System.out.println(Bicicleta.getNumBicis());
		System.out.println(Bicicleta.getNumBicis());
		
		
	}
}
