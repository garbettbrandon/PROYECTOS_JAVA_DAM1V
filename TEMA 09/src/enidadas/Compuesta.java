package enidadas;

public class Compuesta {
	//Atributos
	int externo_x = 10;
	static int externo_y = 20;
	private static int externoPrivado = 30;
	
	public Compuesta(int externo_x) {
		this.externo_x = externo_x;
	}

	public Compuesta() {
	}

	public static int getExternoPrivado() {
		return externoPrivado;
	}

	public static void setExternoPrivado(int externoPrivado) {
		Compuesta.externoPrivado = externoPrivado;
	}
	
	@Override
	public String toString() {
		return "Compuesta [externo_x=" + externo_x + "]";
	}
	
	public void mostrar2() {
		System.out.println();
	}

	public static class Anidada {
		int interno;

		public Anidada(int interno) {
			this.interno = interno;
		}

		public Anidada() {
		}
		
		public void mostrar () {
			System.out.println("Atributo interno: "+interno);
			System.out.println("Atributo externo: "+externo_y);
			System.out.println("Atributo externo privado: "+externoPrivado);
		}
	}
}
