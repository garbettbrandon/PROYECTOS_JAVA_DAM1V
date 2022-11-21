package practica_9_5;

import java.util.Scanner;

public class Recursivo_6 {
	public static Scanner sc;
	public static void main(String[] args) {
		int num1=0, num2=0;
		sc = new Scanner (System.in);
		System.out.print("Introduce el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("El mcd de "+num1+" y "+num2+" es "+obtener_mcd(num1,num2));
	}
	
	public static int obtener_mcd(int a, int b) {
	       if(b==0)
	           return a;
	       else
	           return obtener_mcd(b, a % b);
	   }
}
