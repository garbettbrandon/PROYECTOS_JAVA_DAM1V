package recursividad;

public class Ejemplo {

	public static void main(String[] args) {
		
		int numero = 5, num1=3,num2=4;
		System.out.println(numero +"! = "+factorial(numero));
		
		System.out.println(num1+"+"+num2+"="+suma(num1,num2));
	}
	
	public static int factorial(int num) {
		if (num==0) {
			return 1;
		}else return num * factorial(num-1);
	}
	
	public static int suma (int a, int b) {
		if (b==0) {
			return a;
		}else return 1+suma(a,b-1);
	}
}
