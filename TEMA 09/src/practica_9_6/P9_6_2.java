package practica_9_6;

public class P9_6_2 {
	
	public static void main(String[] args) {
		if (args.length >= 1) {
			for(String arg:args) {
				System.out.println("Hola "+ arg);
			}
		}else{
			System.out.println("Falta el nombre de la persona");
		}
	}
}
