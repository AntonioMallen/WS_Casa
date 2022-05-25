package ejerciciocpasswd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Validar {
	String fichero;
	String nombre;
	String passwd;
	
	Scanner s=null;
	
Validar(String archivo){
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
public boolean validacion(String nombre, String passwd) {
	comprobarUsuario(nombre);
	if(nombre.equals(this.nombre)) {
		if(this.passwd.equals(passwd)) {
			System.out.println("Accediendo a la cuenta");
			return true;
		}else {
			System.out.println("La contraseña no es correcta");
		}
	}else {
		System.out.println("El nombre no esta registrado");
	}
	
	return false;
}
	

public void comprobarUsuario(String nombre) {
	boolean existe = false;
	while(s.hasNext()) {
		String n= s.next();
		if(nombre.equals(n)) {
			this.nombre=n;
			existe = true;
		}
		if (existe == true) {
			this.passwd=s.next();

		}
		s.nextLine();
	}
}
}