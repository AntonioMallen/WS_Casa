
import java.util.*;
import java.io.*;
/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos ficheros,
de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos
ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda
será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
pueden tener tamaños diferentes.
 *
 * @author Dhrazak
 *
 */

public class Ej_3 {
	
	
	
	Scanner archivo1= null;
	Scanner archivo2= null;
	PrintStream mezcla= null;
	List<String> vector = new ArrayList<String>();
	
	
	Ej_3(/* String ar1, String ar2*/) { 
		try {
		archivo1= new Scanner (new BufferedReader(new FileReader("A:\\Archivo1.txt")));		
		archivo2=new Scanner(new BufferedReader(new FileReader("A:\\Archivo2.txt")));
		
		while(archivo1.hasNext() || archivo2.hasNext()){
			if(archivo1.hasNextLine()) {
				vector.add(archivo1.nextLine());
			}
			if(archivo2.hasNextLine()) {
				vector.add(archivo2.nextLine());
			}
		}
		}catch(FileNotFoundException e) {
			
		}
	}
	
	
	void mezclar() {
		try {
		mezcla = new PrintStream(new FileOutputStream ("A:\\mezcla.txt"));
		for( String i : vector) {
			 mezcla.println(i);
		}
		}catch(FileNotFoundException e) {
			
		}finally {
			mezcla.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner tec = new Scanner(System.in);
		/*
		System.out.println("Dime el nombre del primer archivo");
		String p = tec.next();
		System.out.println("Dime el nombre del segundo archivo");
		String s = tec.next();
		*/
		Ej_3 oj = new Ej_3();
		oj.mezclar();
		
	}

}
