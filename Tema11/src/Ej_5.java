/**
 * 
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
Por ejemplo:
quita_comentarios hola.java holav2.java

crea un fichero con nombre holav2.java que contiene el código de hola.java pero
sin los comentarios.
 * 
 * 
 * @author Dhrazak
 *
 */
import java.util.*;
import java.io.*;

public class Ej_5 {

	PrintStream v2 = null;
	BufferedReader ar = null;
	
	Ej_5( String archivo ){
		try {
			ar=new BufferedReader(new FileReader(archivo+".txt"));
			v2=new PrintStream(new FileOutputStream(archivo+"v2.java"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*
	public void quitaComentarios() {
		char cont; 
		try {
			while( (cont = ar.read()) !=-1) {
				if(cont=="/") {
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
		
		
	}

}
