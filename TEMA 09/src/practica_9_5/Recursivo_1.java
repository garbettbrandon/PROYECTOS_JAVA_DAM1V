package practica_9_5;

import java.util.Scanner;

public class Recursivo_1 {

	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce el numero final: ");
		n = sc.nextInt();
		System.out.println("Suma de sus ateriores: "+suma(n));
		sc.close();
	}
	
	public static int suma (int n) {
		if (n==0) {
			return n;
		}else return n + suma(n - 1);
	}
}
