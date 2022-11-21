import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ejercicioExamen {

	public static void main(String[] args) throws IOException {

		String ficheroPartidos = "C:/Users/brand/Desktop/partidos.txt";

		ArrayList<Partido> partidos = obtenerPartidos(ficheroPartidos);

		muestraPartidos(partidos);

		System.out.println("\n Partidos del Madrid");
		ArrayList<Partido> partidosEquipo = obtenerPartidos("Madrid", partidos);
		System.out.println(partidosEquipo);
		muestraPartidos(partidosEquipo);

		puntosEquipo("Madrid", partidosEquipo);

		serializarPartidos(partidosEquipo);
	}

	private static ArrayList<Partido> obtenerPartidos(String ficheroPartidos) {
		ArrayList<Partido> partidos = new ArrayList<>();
		try {
			FileReader fr = new FileReader(ficheroPartidos);
			BufferedReader bf = new BufferedReader(fr);
			String linea = bf.readLine();
			while (linea != null) {
				String vector[] = linea.split("::");
				partidos.add(new Partido(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3])));
				linea = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			System.out.println("Error E/S");
		}
		return partidos;
	}

	private static void muestraPartidos(ArrayList<Partido> partidos) {
		for (Partido p : partidos) {
			System.out.println(p.getEquipoL()+" "+p.getGolesL()+" - "+p.getGolesV()+" "+p.getEquivoV());
		}
	}

	private static ArrayList<Partido> obtenerPartidos(String equipo, ArrayList<Partido> partidos) {
		ArrayList<Partido> partidosEquipo = new ArrayList<>();
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getEquipoL().equalsIgnoreCase(equipo)
					|| partidos.get(i).getEquivoV().equalsIgnoreCase(equipo)) {
				partidosEquipo.add(partidos.get(i));
			}
		}
		return partidosEquipo;
	}

	private static void puntosEquipo(String equipo, ArrayList<Partido> partidosEquipo) {
		int puntos = 0;
		for (int i = 0; i < partidosEquipo.size(); i++) {
			if (partidosEquipo.get(i).getGolesL() > partidosEquipo.get(i).getGolesV()
					&& partidosEquipo.get(i).getEquipoL().equalsIgnoreCase(equipo)) {
				puntos = puntos + 3;
			} else if (partidosEquipo.get(i).getGolesL() < partidosEquipo.get(i).getGolesV()
					&& partidosEquipo.get(i).getEquivoV().equalsIgnoreCase(equipo)) {
				puntos = puntos + 3;
			} else if (partidosEquipo.get(i).getGolesL() == partidosEquipo.get(i).getGolesV()) {
				puntos = puntos + 1;
			} else {
				puntos = puntos + 0;
			}
		}
		System.out.println("Puntos " + equipo + ": " + puntos);
	}

	private static void serializarPartidos(ArrayList<Partido> partidosEquipo) throws IOException {
		try (RandomAccessFile randomFile = new RandomAccessFile("C:/Users/brand/Desktop/Equipo.dat", "rw");) {
			for (Partido p : partidosEquipo) {
				StringBuffer sb = new StringBuffer(p.getEquipoL());
				sb.setLength(10);
				randomFile.writeChars(sb.toString());

				StringBuffer sb2 = new StringBuffer(p.getEquivoV());
				sb2.setLength(10);
				randomFile.writeChars(sb2.toString());

				randomFile.writeInt(p.getGolesL());
				randomFile.writeInt(p.getGolesV());
			}
			
			System.out.println("CONTENIDO FICHERO ALEATORIO DEL MADRID");
			randomFile.seek(0);
			
			while (true) {
				String local = "";
				for (int i = 0; i < 10; i++) {
					local += randomFile.readChar();
				}
				System.out.print(local);
				
				String visita = "";
				for (int i = 0; i < 10; i++) {
					visita += randomFile.readChar();
				}
				System.out.print(visita);

				System.out.print(" "+randomFile.readInt()+" ");
				System.out.print(" "+randomFile.readInt()+" \n");
			}
			
			

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se ha encontrado o no se pudo crear en el directorio indicado");
		} catch (EOFException e1) {
			System.out.println("Final del Fichero");
		}
	}

}
