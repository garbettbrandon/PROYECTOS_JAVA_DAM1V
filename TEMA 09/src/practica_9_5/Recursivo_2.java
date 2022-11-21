package practica_9_5;

import java.util.Scanner;

public class Recursivo_2 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce 2 numeros y te calculo sus pares!");
		System.out.print("Numero 1: ");
		num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			int aux;
			aux=num1;
			num1=num2;
			num2=aux;
		}
		if(num1%2!=0) num1-=1;
		if(num2%2!=0) num2+=1;
		System.out.println("La suma de sus pares es: "+sumaPares(num1, num2));
		
		sc.close();
	}
	
	public static int sumaPares(int num1, int num2) {
		if (num1<num2) {
			return num1;
		}return num1 + sumaPares(num1 -2, num2);
	}
}
