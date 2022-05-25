import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo {

	public static ArrayList<Objetoprueba> leer(){
		
		ArrayList<Objetoprueba> vector =new ArrayList<Objetoprueba>();
		
		try (ObjectInputStream lecturaObjetos = new ObjectInputStream(new FileInputStream("agenda.dat"))) {
			
			while(true){
				Objetoprueba o = (Objetoprueba)lecturaObjetos.readObject();
				vector.add(o);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("No hay fichero");
			return null;
		} catch (EOFException ex) {
			System.out.println("Contactos añadidos del fichero");
			return vector;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return vector;
		
	}
	
	public static void escribir(ArrayList<Objetoprueba> asd) {
		try (ObjectOutputStream escribirObjeto = new ObjectOutputStream(new FileOutputStream("agenda.dat"))) {
			for (Object tfno : asd) {
				escribirObjeto.writeObject(tfno);
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} 
	}
	
	
}
