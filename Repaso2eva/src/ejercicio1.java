
import java.util.Scanner;

public class ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final int filas = 4, columnas = 5;
        int [][] tablaBidi = new int[filas][columnas];
        rellenarTabla(tablaBidi);
        System.out.println("TABLA ORIGINAL");
        mostrarTabla(tablaBidi);
    }
    public static void rellenarTabla(int[][] tablaBidi) {
        for (int f = 0; f < tablaBidi.length; f++) {
            for (int c = 0; c < tablaBidi[0].length; c++) {
                tablaBidi[f][c]= (int)(Math.random()*21);
            }
        }
    }
    public static void mostrarTabla(int[][] tablaBidi) {
        for (int f = 0; f < tablaBidi.length; f++) {
            for (int c = 0; c < tablaBidi[0].length; c++) {
                if (c==0){
                    System.out.println();
                }
                System.out.printf("%2d\t",tablaBidi[f][c]);
            }
        }
    }
}