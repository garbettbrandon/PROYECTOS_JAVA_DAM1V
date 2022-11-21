package enidadas;

public class Controladora {
	public static void main(String[] args) {
		Compuesta objeto = new Compuesta();
		System.out.println(objeto.toString());
		
		Compuesta.Anidada objetoAnidada = new Compuesta.Anidada();
		objetoAnidada.mostrar();
		
		//System.out.println("Atributo interno clase anidada: "+Compuesta.Anidada.interno);
		
		
	}
}
