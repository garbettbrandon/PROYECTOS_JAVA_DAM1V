package practica_9_6;

import java.util.Arrays;

public class OrdenarV2 {

	public static void main(String[] args) {
		int[] args2 = new int [args.length];
		for(int i = 0; i < args.length; i++) {
			args2[i] = Integer.parseInt(args[i]);
		}
		if (args2.length > 1) {
			Arrays.sort(args2);
			for (int k : args2) {
	            System.out.printf("%3d ",k);
	        }	
		
		}else if (args.length == 0) {
			System.out.println("No has pasado numeros por parametro");
		}else {
			System.out.println("Solo has metido 1 numero "+args[0]);
		}
	}

}