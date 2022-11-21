package practica_9_5;

import java.util.Scanner;

public class Recursivo_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo, divisor;
		System.out.print("Introduzca dividendo: ");
		dividendo = sc.nextInt();
		System.out.print("Introduzca divisor: ");
		divisor = sc.nextInt();
		if (divisor == 0) {
			System.out.println("No puedes dividir por cero!");
		}else if(dividendo < 0) {
			if (divisor < 0) {
				System.out.println(dividendo + " / " + divisor + " = " + divisionRecursiva(dividendo*(-1), divisor*(-1)));
			}else {
				System.out.println(dividendo + " / " + divisor + " = " + divisionRecursiva(dividendo*(-1), divisor)*(-1));
			}
		}else{
			if (divisor < 0) {
				System.out.println(dividendo + " / " + divisor + " = " + divisionRecursiva(dividendo, divisor*(-1))*(-1));
			}else {
				System.out.println(dividendo + " / " + divisor + " = " + divisionRecursiva(dividendo, divisor));
			}
		}
		sc.close();
	}

	public static int divisionRecursiva(int dividendo, int divisor) {
		if (dividendo < divisor) return 0;
		return 1 + divisionRecursiva(dividendo - divisor, divisor);
	}
}