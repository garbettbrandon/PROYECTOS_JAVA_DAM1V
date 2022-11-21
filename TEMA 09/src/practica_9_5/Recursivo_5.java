package practica_9_5;

import java.util.Scanner;

public class Recursivo_5 {
	public static Scanner sc;

	public static void main(String[] args) {
		int num;
		sc = new Scanner(System.in);
		System.out.print("Introduce un número para invertir: ");
		num = sc.nextInt();
		sc.close();
		System.out.printf("%nEl número %d invertido es el %s", num, invertirNumeroString(num));
		int numCifras = String.valueOf(num).length();
		System.out.printf("El número %d invertido es el %d", num, invertirNumero(num, numCifras - 1));
	}

	public static int invertirNumero(int num, int pos) {
		if (num < 10) {
			return num;
		} else {
			return num % 10 * (int) Math.pow(10, pos) + invertirNumero(num / 10, pos - 1);
		}
	}

	public static String invertirNumeroString(int num) {
		if (num < 10) {
			return String.valueOf(num);
		} else {
			return String.valueOf(num % 10) + invertirNumeroString(num / 10);
		}
	}
}
