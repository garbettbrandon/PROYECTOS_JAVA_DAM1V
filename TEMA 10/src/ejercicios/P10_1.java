package ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P10_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int array[][] = new int[pedirFilas()][pedirColumnas()];

		cargarArray(array);
		mostrarArray(array);
		ordenarArray(array);
	}

	public static int pedirFilas() {
		int filas;

		do {
			System.out.print("Declara las filas: ");
			filas = sc.nextInt();
		} while (filas <= 1 || filas > 4);

		return filas;
	}

	public static int pedirColumnas() {
		int columnas;
		do {
			System.out.print("Declara las columnas: ");
			columnas = sc.nextInt();
			return columnas;
		} while (columnas <= 1 || columnas > 4);
	}

	public static void cargarArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("Valor para fila " + i + " columna " + j + ": ");
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println();
	}

	public static void mostrarArray(int array[][]) {
		System.out.println("Array sin ordenar: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void ordenarArray(int array[][]) {
		System.out.println("Array ordenado: ");
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}
