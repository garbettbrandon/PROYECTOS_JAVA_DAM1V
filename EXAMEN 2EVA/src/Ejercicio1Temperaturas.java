
public class Ejercicio1Temperaturas {

	public static void main(String[] args) {
		int sumaTemp, tempMasBaja, diaMasFrio, sumaDiurnaMes;
		double mediaDia, mediaDiurnaMes;
		int [][] temp = new int [8][31];
		
		//Rellenar y validar temperaturas
		
		diaMasFrio=1;
		tempMasBaja=temp[0][0];
		sumaDiurnaMes=0;
		
		for (int c = 0; c < temp[0].length; c++) {
			sumaTemp=0;
			for (int f = 0; f < temp.length; f++) {
				sumaTemp+=temp[f][c];
				if (f < 4 && temp[f][c]<tempMasBaja) {
					tempMasBaja = temp [f][c];
					diaMasFrio=c+1;
				}
				if (f>=4) {
					sumaDiurnaMes+=temp[f][c];
				}
			}
			mediaDia=sumaTemp/temp.length;
			System.out.println("Temperatura media del día "+(c+1)+": "+mediaDia);
		}
		System.out.println("El dia con la temperatura nocturna mas baja ha sido "+diaMasFrio);
		System.out.println("La media de las temperaturas diurnas del mes ha sido "+(sumaDiurnaMes/(31*4)));
	}
}
