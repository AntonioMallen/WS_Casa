package ejerciciocpasswd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Mostrar {
	
	String fichero;
	Scanner s;
	
Mostrar(String archivo) throws IOException{
	fichero = archivo;
	boolean add;
	
	//System.out.println("Abro fichero: " + fichero);
	try {
		s = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
	} catch (FileNotFoundException e1) {
		add = false;
	}
}
	
	
	public void ensenar () {
		System.out.println("Lista de usuarios ya creados");
		while (s.hasNext() ) {
			System.out.println(s.next());
			s.nextLine();
		}
	}

}
