package ejercicio1;

import java.io.IOException;
import java.util.*;

public class Agenda {

	private String fichero;
	
	
	ArrayList<Contacto> contactos ;
		
	
	public Agenda(String archivo){
		fichero=archivo;
		this.contactos=new ArrayList<Contacto>();	
	}
	
	
	
	public void anadir (String nom, String ape ) {
		if (comprobarCont(nom,ape)) {
			Contacto nuevo = new Contacto(nom,ape);
			contactos.add(nuevo);
		}else {
			System.out.println("Contacto repetido");
		}
		
	}
	
	
	public void ordenar() throws IOException {
		Set<String> ordenado = new TreeSet<String>();
		
		
		
		for(Contacto x : contactos) {
			for(String y : ordenado) {
				
			}
			System.out.println(x);
		}
	}
	
	public void guardar() {
		try {
			Archivo.escribir(fichero, contactos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void leer() throws IOException {
		contactos.addAll(Archivo.leer(fichero));
	}

	public boolean comprobarCont(String nom, String ape) {
		if( contactos != null) {
			for(Contacto x : contactos) {
				if(x.getNombre().equals(nom)) {
					if(x.getApellido().equals(ape)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	
}
