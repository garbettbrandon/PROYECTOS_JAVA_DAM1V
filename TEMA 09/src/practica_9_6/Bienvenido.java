package practica_9_6;

public class Bienvenido {

	public static void main(String[] args) {
		String usuario = "Brandon", contraseña = "password";
		
		if (args.length > 1) {
			if (usuario == "Brandon" && contraseña == "password") {
				System.out.println("Bienvenido "+args[0]);
			}else {
				System.out.println("Usuario o contrase�a incorrecta");
			}
		}else if (args.length == 0) {
			System.out.println("No has pasado nada por parametro");
		}else {
			System.out.println("Falta la contrase�a");
		}
	}
}
