package ejercicio1;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	// Nombre del archivo de trabajo
	String fichero;

	// Entrada de datos
	Scanner in = new Scanner(System.in);
	
	
	// Crear agenda
	Agenda a = null;

	public Menu ( String archivo ) throws IOException {
		fichero = archivo;
		boolean fin;
		a = new Agenda(fichero);
		a.leer();
		do {
			fin = trabajo(); 	
		} while ( ! fin );
	}

	private void imprimir ( ) {
		System.out.println("Elija una opción");
		System.out.println("1.- Anadir contacto\n"
				+ "2.- Borrar contacto\n"
				+ "3.- Listado en orden alfabético\n"
				+ "4.- Buscar por nombre\n"
				+ "5.- Añadir un télefono\n"
				+ "6.- Borrar un télefono\n"
				+ "7.- Buscar por telefono");
		System.out.println("0.- Salir");

	}
	private boolean trabajo ( ) throws IOException {
		int opcion=0;

		do {
			if ( opcion < 0 || opcion > 7 ) {
				System.out.println("Debe introducir un número entre 0 y 7");
			}
			imprimir();
			
			opcion = in.nextInt();
		} while ( opcion < 0 || opcion > 7 );
		if ( opcion == 0 ) {
			a.guardar();
			return true;
		}
		switch ( opcion ) {
		case 1:
			anadir();
			break;
		case 2:
			borrar();
			break;
		case 3:
			ordenar();
			break;
		case 4:
			buscarNom();
			break;

		case 5:
			anadirTel();
			break;
		case 6:
			borrarTel();
			break;

		case 7:
			buscarTel();
			break;
		}

		return false;
	}

	public void anadir ( ) {
		System.out.println("Dime el nombre del contacto");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del contacto");
		String ape = in.nextLine();
		a.anadir(nom,ape);
	}


	public void borrar() throws IOException {

	}


	public void ordenar() throws IOException {
		a.ordenar();
	}


	public void buscarNom() {

	}


	public void anadirTel() throws IOException {

	}


	public void borrarTel() throws IOException {

	}


	public void buscarTel() throws IOException {

	}
	
	

}


