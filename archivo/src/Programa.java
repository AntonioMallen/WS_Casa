import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<Objetoprueba> vector = new ArrayList<Objetoprueba>();
		Objetoprueba p1 = new Objetoprueba("Antonio","123");
		Objetoprueba p2 = new Objetoprueba("Ionut","12332");
		vector.add(p1);
		vector.add(p2);
		Archivo.escribir(vector);
		
		
		ArrayList<Objetoprueba> lectura = new ArrayList<Objetoprueba>();
		
		lectura=Archivo.leer();
		System.out.println(lectura.get(0).getNombre());
		System.out.println(lectura.get(1).getNombre());

	}

}
