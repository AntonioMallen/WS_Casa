package ejerciciocpasswd;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Modificar {

	String fichero;
	Scanner s = null;
	PrintStream tmp;

	public Modificar ( String archivo ) throws FileNotFoundException {
		fichero = archivo;
		s = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
	}



	public boolean comprobarUsuario ( String nombre ) throws FileNotFoundException {
		Scanner a = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
		try {
		while ( a.hasNext() ) {
			String usuario = s.next();
			if ( nombre.equals(usuario) )
				return true;
			a.nextLine();
		}

		return false;
		}finally {
			a.close();
		}
	}


	public void cambiar(String nombre, String contra) throws IOException {
		tmp = new PrintStream(
				new FileOutputStream("tmp.txt"));
		if(comprobarUsuario(nombre)==true) {
			while(s.hasNextLine()) {
				String n= s.next();
				System.out.println(n);
				String passwd=s.next();
				if( nombre.equals(n)&&s.hasNextLine()) {
					passwd= contra;
				}
				else {
					n="";
					passwd="";
				} 

				tmp.println(n+ " "+ passwd);

				s.nextLine();
			}
			Scanner templectura= null;
			PrintStream tempescritura= null;
			try {
				templectura = new Scanner(
						new BufferedReader(
								new FileReader("tmp.txt")));
				tempescritura = new PrintStream (new FileOutputStream(fichero));
			} catch (FileNotFoundException e1) {

			} finally {
					s.close();
					tmp.close();
			}
			while(templectura.hasNext()) {
				String ntemp= templectura.next();
				String passwdtemp= templectura.next();
				tempescritura.println(ntemp+ " "+ passwdtemp);
				templectura.nextLine();
			}
			templectura.close();
			tempescritura.close();
		}
	}
}

