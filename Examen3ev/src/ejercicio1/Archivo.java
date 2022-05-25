package ejercicio1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo {

	public static ArrayList<Contacto> leer(String fichero) throws IOException{
		
		ArrayList<Contacto> vector =new ArrayList<Contacto>();
		
		ObjectInputStream lecturaObjetos = null;
		try { 
			lecturaObjetos = new ObjectInputStream(new FileInputStream(fichero));
			while(true){
				Contacto o = (Contacto)lecturaObjetos.readObject();
				vector.add(o);
			}

		} catch (FileNotFoundException ex) {
			return null;
		} catch (EOFException ex) {
			System.out.println("Contactos añadidos del fichero");
			return vector;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		if(lecturaObjetos!=null) {
			lecturaObjetos.close();
		}
		
		return vector;
		
	}
	
	public static void escribir(String fichero, ArrayList<Contacto> asd) throws IOException {
		ObjectOutputStream escribirObjeto = null;
		try { 
			escribirObjeto = new ObjectOutputStream(new FileOutputStream(fichero));
			for (Object contactos : asd) {
				escribirObjeto.writeObject(contactos);
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} 
		if(escribirObjeto!=null) {
			escribirObjeto.close();
		}
	}
	
	
}
