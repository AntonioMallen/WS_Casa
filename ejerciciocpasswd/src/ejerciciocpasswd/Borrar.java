package ejerciciocpasswd;

import java.io.*;
import java.util.Scanner;

public class Borrar {
	String fichero;
	String nombre;
	String passwd;
	
	Scanner s=null;
	PrintStream tmp=null;
	
Borrar(String archivo) throws IOException{
	fichero = archivo;
	boolean add;
	
	//System.out.println("Abro fichero: " + fichero);
	try {
		s = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
		tmp = new PrintStream (new FileOutputStream("tmp.txt"));
	} catch (FileNotFoundException e1) {
		add = false;
	}
}

public boolean comprobarUsuario ( String nombre ) {
	if ( s == null )
		return false;
	boolean encontrado = false;
	// System.out.println("Compruebo nombre de usuario en archivo");
	while ( ! encontrado && s.hasNext() ) {
		String usuario = s.next();
		if ( nombre.equals(usuario) )
			return true;
		s.nextLine();
	}
	return false;
}

public void borrar(String nombre) throws IOException {
	while(s.hasNext()) {
		String n= s.next();
		String passwd= s.next();
		if( nombre.equals(n)&&s.hasNextLine()) {
			s.nextLine();
			n= s.next();
			passwd= s.next();
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
