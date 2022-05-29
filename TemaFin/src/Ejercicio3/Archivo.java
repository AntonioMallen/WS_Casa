package Ejercicio3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo {

	public static ArrayList<Socio> leerSocios(String fichero) {
		
		ArrayList<Socio> vector =new ArrayList<Socio>();
		
		ObjectInputStream lecturaObjetos = null;
		try { 
			lecturaObjetos = new ObjectInputStream(new FileInputStream(fichero));
			while(true){
				Socio o = (Socio)lecturaObjetos.readObject();
				vector.add(o);
			}

		} catch (FileNotFoundException ex) {
			return null;
		} catch (EOFException ex) {
			System.out.println("Contactos añadidos del fichero");
			if(lecturaObjetos!=null) {
				try {
					lecturaObjetos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return vector;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		if(lecturaObjetos!=null) {
			try {
				lecturaObjetos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return vector;
		
	}
	
	public static void escribirSocios(String fichero, ArrayList<Socio> asd) {
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
			try {
				escribirObjeto.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
public static ArrayList<Reserva> leerReservas(String fichero) {
		
		ArrayList<Reserva> vector =new ArrayList<Reserva>();
		
		ObjectInputStream lecturaObjetos = null;
		try { 
			lecturaObjetos = new ObjectInputStream(new FileInputStream(fichero));
			while(true){
				Reserva o = (Reserva)lecturaObjetos.readObject();
				vector.add(o);
			}

		} catch (FileNotFoundException ex) {
			System.out.println();
			return null;
		} catch (EOFException ex) {
			System.out.println("Contactos añadidos del fichero");
			if(lecturaObjetos!=null) {
				try {
					lecturaObjetos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return vector;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		if(lecturaObjetos!=null) {
			try {
				lecturaObjetos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return vector;
		
	}
	
	public static void escribirReservas(String fichero, ArrayList<Reserva> asd) {
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
			try {
				escribirObjeto.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	public void guardar() {
		Archivo.escribir(fichero, contactos);
	}


	public void leer() throws IOException {
		contactos.addAll(Archivo.leer(fichero));
	}
	 */
	
	
}
