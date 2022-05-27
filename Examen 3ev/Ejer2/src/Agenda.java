

import java.io.IOException;
import java.util.*;

public class Agenda {

	private String fichero;


	ArrayList<Contacto> contactos ;
	ArrayList<Contacto> tmp =new ArrayList<Contacto>();;


	public Agenda(String archivo){
		fichero=archivo;
		this.contactos=new ArrayList<Contacto>();	
	}



	public void anadir (String nom, String ape ) {
		if (!comprobarCont(nom,ape)) {
			Contacto nuevo = new Contacto(nom,ape);
			contactos.add(nuevo);
			guardar();
		}else {
			System.out.println("Contacto repetido");
		}

	}
	public void borrar( String nom, String ape ) throws IOException {
		if(comprobarCont(nom,ape)) {
			Boolean borrado = false;
			Iterator<Contacto> itr = contactos.iterator(); // creo el iterator para recorrer el vector
			while(itr.hasNext() && borrado ==false) {
				Contacto x = itr.next();
				if(x.getNombre().equals(nom) && x.getApellido().equals(ape)) {
					contactos.remove(x);
					borrado = true;
				}
			}
			guardar();
		}else {
			System.out.println("El contacto no existe");
		}
	}

	public void ordenar() throws IOException {
		Collections.sort(contactos);
		
		for (Contacto o : contactos)
			System.out.println(o);
	}


	public void buscarNom(String nom, String ape) {
		if( contactos != null) {
			for(Contacto x : contactos) {
				if(x.getNombre().equals(nom)) {
					System.out.println(x);
				}
			}
		}
	}

	public void anadirTel(String nom, String ape, String num,String desc) throws IOException {
		if (comprobarCont(nom,ape)) {
			for(Contacto x : contactos) {
				if(x.getNombre().equals(nom) && x.getApellido().equals(ape)) {
					Telefono t =new Telefono(num,desc);
					
					x.telefonos.add(t);
				}
			}
			guardar();
		}
	}
	
	public void borrarTel(String nom,String ape,String num) throws IOException {
		boolean borrado=false;
		for(Contacto e : contactos) {
			if(e.getNombre().equals(nom) && e.getApellido().equals(ape)) {
				Iterator<Telefono> itr = e.telefonos.iterator();
				while(itr.hasNext()&& borrado ==false) {
					Telefono t =itr.next();
					if(t.getNumero().equals(num)) {
						itr.remove();
						borrado=true;
					}
				}
			}
		}
		guardar();
	}
	
	public void buscarTel(String num) throws IOException {
		for(Contacto e : contactos) {
			for (Telefono t : e.telefonos) {
				if(t.getNumero().equals(num)) {
					System.out.println(e);
				}	
			}
		}
	}
	
	public void asignarSexo() {
		Random r = new Random();
		tmp.clear();
		for(Contacto c : contactos) {
			int num =r.nextInt(2);
				if(num==1) {
					c = new Hombre(c.getNombre(),c.getApellido(),r.nextBoolean());
					tmp.add(c);
				}else {
					c = new Mujer(c.getNombre(),c.getApellido(),r.nextInt(5));
					tmp.add(c);
				}
		}
		contactos.clear();
		contactos.addAll(tmp);
	}
	
	public void verInfo() {
		for(Contacto x : contactos) {
			System.out.println(x);
		}
	}

	public void guardar() {
		Archivo.escribir(fichero, contactos);
	}


	public void leer() throws IOException {
		contactos.addAll(Archivo.leer(fichero));
	}

	public boolean comprobarCont(String nom, String ape) {
		if( contactos != null) {
			for(Contacto x : contactos) {
				if(x.getNombre().equals(nom)&& x.getApellido().equals(ape)) {
					return true;
				}
			}
		}
		return false;
	}





}
