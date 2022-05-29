package Ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Programa {

	private String socios;
	private String reservas;


	ArrayList<Socio> vectorSocios = new ArrayList<Socio>();
	ArrayList<Reserva> vectorReservas = new ArrayList<Reserva>();

	public Programa ( String socios, String reservas ) throws IOException {
		this.socios = socios;
		this.reservas = reservas;
	}

	public void anadir (String nom, String ape ) {
		if (!comprobarSoc(nom,ape)) {
			Socio nuevo = new Socio(nom,ape);
			vectorSocios.add(nuevo);
		}else {
			System.out.println("Contacto repetido");
		}

	}

	public void borrar( String nom, String ape ) throws IOException {
		if(comprobarSoc(nom,ape)) {
			Boolean borrado = false;
			Iterator<Socio> itr = vectorSocios.iterator(); // creo el iterator para recorrer el vector
			while(itr.hasNext() && borrado ==false) {
				Socio x = itr.next();
				if(x.getNombre().equals(nom) && x.getApellidos().equals(ape)) {
					vectorSocios.remove(x);
					borrado = true;
				}
			}
		}else {
			System.out.println("El contacto no existe");
		}
	}


	public void modificarFecha(String nom, String ape, String fechaAlta) {
		for(Socio x : vectorSocios) {
			if(x.getNombre().equals(nom)&& x.getApellidos().equals(ape)) {
				x.setFechaAlta(fechaAlta);
			}
		}
	}

	public void modificarNum(String nom, String ape, int num) {
		for(Socio x : vectorSocios) {
			if(x.getNombre().equals(nom)&& x.getApellidos().equals(ape)) {
				x.setNumeroSocio(num);
			}
		}
	}

	public void modificarTipo(String nom, String ape, String tipo) {
		tipo=tipo.toLowerCase();
		if(tipo=="infantil" || tipo=="adulto" || tipo=="juvenil") {
			
			for(Socio x : vectorSocios) {
				if(x.getNombre().equals(nom)&& x.getApellidos().equals(ape)) {
					x.setTipo(tipo);
				}
			}
			
		}else {
			System.out.println("El tipo seleccionado no es correcto");
		}
	}




	public boolean comprobarSoc(String nom, String ape) {
		if( socios != null) {
			for(Socio x : vectorSocios) {
				if(x.getNombre().equals(nom)&& x.getApellidos().equals(ape)) {
					return true;
				}
			}
		}
		return false;
	}

	public void guardar() {
		Archivo.escribirSocios(socios, vectorSocios); // se guardan los socios
		Archivo.escribirReservas(reservas, vectorReservas); // y las reservas
	}

	public void leer() {
		vectorSocios.addAll(Archivo.leerSocios(socios));
		vectorReservas.addAll(Archivo.leerReservas(reservas));
	}

}
