package p11_6;

public class UsoMaquinas {

	public static void main(String[] args) {
		Industrial nba2k = new Industrial(22, 24, "EA", 700);
		Domestica kh7 = new Domestica(2, 10, "Cecotec");
		
		nba2k.encender();
		
		kh7.encender();
		
		nba2k.apagar();
		
		kh7.apagar();
	}

}
