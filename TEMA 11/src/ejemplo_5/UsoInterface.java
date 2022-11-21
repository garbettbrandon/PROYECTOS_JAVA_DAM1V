package ejemplo_5;

public class UsoInterface {
	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo(10,20);
		Rectangulo rect2 = new Rectangulo(15,10);
		
		//rect1 = (Rectangulo) rect1;
		if(rect1.isLargerThan(rect2)) 
			System.out.printf("El rectángulo primero de  %2d ancho x %2d alto es más grande que el segundo %n "
				,rect1.ancho,rect1.alto,rect2.ancho,rect2.alto);
		else 
			System.out.printf("El rectángulo segundo de  %2d ancho x %2d alto es más grande que el primero %n"
					,rect1.ancho,rect1.alto,rect2.ancho,rect2.alto);
		
		rect1.metodoPorDefecto();
		FiguraGeometrica.metodoEstatico() ;
		//rect1.metodoEstatico();
	}
}
