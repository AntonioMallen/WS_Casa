/**
 * 
 * Ejercicio 6
Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.
 * 
 * 
 * @author Dhrazak
 *
 */

import java.util.*;
import java.io.*;


public class Ej_6 {

	private int cont_palabras;
	Scanner x = null;
	
	
	
	
	
	Ej_6(String archivo, String palabra){
		try {
			x= new Scanner(new BufferedReader(new FileReader(archivo+".txt")));
			cont(palabra);
		} catch (FileNotFoundException e) {
				System.out.println("El elemento que buscas, aun no ha sido creado");
		}
		
	}
	
	public void cont(String palabra) {
		while(x.hasNext()) {
			String recorrer=x.next();
			if(palabra.equals(recorrer)) {
				cont_palabras++;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dime el nombre del archivo");
		String nom= tec.next();
		System.out.println("Dime la palabra a contar");
		String pal= tec.next();
		Ej_6 e = new Ej_6(nom,pal);
		System.out.println("La palabra "+ pal +" esta repetida "+e.cont_palabras+" veces");
	}

}
