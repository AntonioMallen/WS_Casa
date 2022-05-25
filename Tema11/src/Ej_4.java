

import java.io.*;
import java.util.*;

/**
 * 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort,
por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 * 
 * 
 * @author Dhrazak
 *
 */
public class Ej_4 {

	TreeSet<String> vector = new TreeSet<String>();
	private String fich;
	Scanner Sc = null;
	PrintStream sort = null;
	
	
	Ej_4(String archivo){
		this.fich=archivo;
		try {
			sort = new PrintStream(new FileOutputStream(fich+"_sort.txt"));
			Sc = new Scanner(new BufferedReader(new FileReader(fich+".txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void annadir() {
		while(Sc.hasNext())
			vector.add(Sc.next());
	}
	
	public void ordenar() {
		for( String elem : vector) {
			sort.println(elem);
		}
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dime el nombre de fichero");
		String result=tec.next();
		Ej_4 e = new Ej_4(result);
		e.annadir();
		e.ordenar();
	}

}
