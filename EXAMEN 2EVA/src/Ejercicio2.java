import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		Profesor[] profes = new Profesor [10];
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < profes.length; i++) {
			//Introducir y validar datos del profesor
			String nombre = sc.nextLine();
			String asignatura = sc.nextLine();
			char situacion = (char)System.in.read();
			double salario = sc.nextDouble();
			int anioIngreso = sc.nextInt();
			profes[i]=new Profesor(nombre, asignatura, situacion, anioIngreso, salario );
		}
		
		profes[0].visualizarNomina(2022);
		
	}

}
