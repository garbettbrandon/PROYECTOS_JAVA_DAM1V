package practica_9_6;

public class Ordenar {

	public static void main(String[] args) {
		if (args.length > 1) {
			int num1,num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			if (num1 > num2) {
				System.out.println("El orden es "+num2+ " "+num1);
			}else if (num1 == num2) {
				System.out.println("Son iguales");
			}else{
				System.out.println("El orden es "+num1+ " "+num2);
			}
		}else if (args.length == 0) {
			System.out.println("No has pasado dos numeros por parametro");
		}else {
			System.out.println("Solo has metido 1 numero "+args[0]);
		}
	}

}
