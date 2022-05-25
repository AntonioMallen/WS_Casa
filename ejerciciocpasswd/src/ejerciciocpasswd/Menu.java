package ejerciciocpasswd;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	// Nombre del archivo de trabajo
	String fichero;

	// Entrada de datos
	Scanner in = new Scanner(System.in);

	public Menu ( String archivo ) throws IOException {
		fichero = archivo;
		boolean fin;
		do {
			fin = trabajo();
		} while ( ! fin );
	}

	private void imprimir ( ) {
		System.out.println("Elija una opción");
		System.out.println("1.- Insertar usuario, clave\n"
				+ "2.- Borrar usuarios\n"
				+ "3.- Modificar claves de un usuario\n"
				+ "4.- Validar si la clave de un usuario es correcta\n"
				+ "5.- Mostrar todos los usuarios");
		System.out.println("6.- Terminar");

	}
	private boolean trabajo ( ) throws IOException {
		int opcion;
		do {
			imprimir();
			try {
				opcion = in.nextInt();
			} catch ( Exception e ) {
				System.out.println("Debe introducir un número entre 1 y 5");
				opcion = 0;
				in.next();
			}
		} while ( opcion < 1 || opcion > 6 );
		if ( opcion == 6 )
			return true;
		switch ( opcion ) {
		case 1:
			insertar();
			break;
		case 2:
			borrar();
			break;
		case 3:
			modificar();
			break;
		case 4:
			validar();
			break;

		case 5:
			mostrar();
			break;
		}
		return false;
	}

	private void insertar ( ) {
		Insertar i = new Insertar(fichero);
		String nombre;

		System.out.println("introduzca un nombre de usaurio");
		try {
			nombre = in.next();
		} catch ( Exception e ) {
			System.out.println("Debe introducir un nombre válido");
			in.next();
			i.finalizar();
			return;
		}

		String passwd;
		if ( i.comprobarUsuario(nombre) ) {
			i.finalizar();
			System.out.println("Ese usuario ya existe");
		} else {
			System.out.println("Introduzca la contraseña");
			try {
				passwd = in.next();
				i.annadirUsuario(nombre, passwd);
			} catch ( Exception e ) {
				System.out.println("Debe introducir una contraseña válido");
				in.next();
				return;
			} finally {
				i.finalizar();
			}
		}
	}
	public void validar() {
		Validar v = new Validar(fichero);
		String u;
		String c;
		System.out.println("Dime el nombre de usuario");
		in.nextLine();
		u=in.nextLine();
		System.out.println("Dime la contraseña del Usuario");
		c=in.nextLine();
		v.validacion(u, c);

	}
	public void borrar() throws IOException {
		Borrar b = new Borrar(fichero);
		String u ;
		System.out.println("Dime el nombre del usuario que deseas borrar");
		u=in.next();
		b.borrar(u);

	}
	public void mostrar() throws IOException {
		Mostrar m = new Mostrar(fichero);
		m.ensenar();
	}
	
	public void modificar() throws IOException {
		Modificar m = new Modificar(fichero);
		String u;
		String c;
		System.out.println("Dime el nombre de usuario");
		in.nextLine();
		u=in.nextLine();
		System.out.println("Dime la contraseña del usuario");
		c=in.nextLine();
		m.cambiar(u, c);

	}

}


