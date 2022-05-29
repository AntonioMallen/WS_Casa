package Ejercicio3;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {

	String socios;
	String reservas;

	// Entrada de datos
	Scanner in = new Scanner(System.in);


	// Crear agenda
	Programa p = null;

	public Menu ( String socios, String reservas ) throws IOException {
		this.socios = socios;
		this.reservas = reservas;

		boolean fin;
		p = new Programa(socios,reservas);

		do {
			fin = trabajo(); 	
		} while ( ! fin );
	}

	private void imprimir ( ) {
		System.out.println("Elija una opción");
		System.out.println("1.- Dar de alta\n"
				+ "2.- Dar de baja\n"
				+ "3.- Modificar datos\n"
				+ "4.- Pago de recibos\n"
				+ "5.- \n"
				+ "6.- \n"
				+ "7.- \n"
				+ "8.- Leer los ficheros\n"
				+ "9.- Guardar los ficheros");
		System.out.println("0.- Salir");

	}
	private boolean trabajo ( ) throws IOException {
		int opcion=0;

		do {
			if ( opcion < 0 || opcion > 9 ) {
				System.out.println("Debe introducir un número entre 0 y 9");
			}
			imprimir();
			try {
				opcion = in.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Solo se admiten numeros dentro de opcion");
			}
		} while ( opcion < 0 || opcion > 9 );
		if ( opcion == 0 ) {
			p.guardar();
			return true;
		}
		switch ( opcion ) {
		case 1:
			darAlta();
			break;
		case 2:
			darBaja();
			break;
		case 3:
			modificarDatos();
			break;
		case 4:
			pago();
			break;

		case 5:
			
			break;
		case 6:
			
			break;

		case 7:
			
			break;
		case 8:
			leerFicheros();
			break;
		case 9:
			guardarFicheros();
			break;
		}

		return false;
	}

	public void darAlta ( ) {
		System.out.println("Dime el nombre del Socio");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del Socio");
		String ape = in.nextLine();
		p.anadir(nom,ape);
	}


	public void darBaja() throws IOException {
		System.out.println("Dime el nombre del Socio");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del Socio");
		String ape = in.nextLine();
		p.borrar(nom, ape);
	}


	public void modificarDatos() throws IOException {
		System.out.println("Dime el nombre del Socio");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del Socio");
		String ape = in.nextLine();
		if(p.comprobarSoc(nom, ape)) {
			System.out.println("Que es lo que quieres modificar\n"
					+ "1. Fecha de alta\n"
					+ "2. Numero de socio\n"
					+ "3. Tipo de socio\n");
			int op = in.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Dime la nueva fecha de alta");
				String fecha = in.nextLine();
				p.modificarFecha(nom, ape, fecha);
				break;
			}
			case 2: {
				System.out.println("Dime el nuevo numero de socio");
				int numeroSocio = in.nextInt();
				p.modificarNum(nom, ape, numeroSocio);
				break;
			}
			case 3: {
				System.out.println("Cual va a ser el nuevo tipo (infantil, juvenil o adulto):");
				String tipo = in.nextLine();
				p.modificarTipo(nom, ape, tipo);
				break;
			}
			default:
				System.out.println("Opcion aun no implementada");
			}
		}else {
			System.out.println("No existe el socio que se busca");
		}
	}


	public void pago() {
		System.out.println("Dime el nombre del contacto que quieres buscar");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del contacto");
		String ape = in.nextLine();
		
	}


	public void anadirTel() throws IOException {
		System.out.println("Dime el nombre del contacto");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del contacto");
		String ape = in.nextLine();
		System.out.println("Dime el numero del contacto");
		String num = in.nextLine();
		System.out.println("Dime la descripcion del contacto");
		String desc = in.nextLine();
		
	}


	public void borrarTel() throws IOException {
		System.out.println("Dime el nombre del contacto");
		in.nextLine();
		String nom = in.nextLine();
		System.out.println("Dime el apellido del contacto");
		String ape = in.nextLine();
		System.out.println("Dime el numero del contacto");
		String num = in.nextLine();
		
	}


	public void buscarTel() throws IOException {
		
	}


	public void leerFicheros() {
		p.leer();
	}

	public void guardarFicheros() {
		p.guardar();
	}

}


