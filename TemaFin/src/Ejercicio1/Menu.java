package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;


public class Menu {

	Scanner in=new Scanner(System.in);
	
	String fichero;
	
	Menu(String archivo){
		fichero=archivo;
		boolean seguir=true;
		do {
			seguir=opciones();
		}while( seguir);

	}

	public boolean opciones() {
		int opcion=0;
			imprimir();
			opcion = in.nextInt();
		if(opcion<0 || opcion>7) {
			System.out.println("Tienes que elegir una opcion entre 1 y 7");
			return true;
		}
		if(opcion == 7) {
			return false;
		}
		switch (opcion) {
		case 1: {
			anadir();
			break;
		}
		case 2: {

			break;
		}
		case 3: {

			break;
		}
		case 4: {

			break;
		}
		case 5: {

			break;
		}
		case 6: {

			break;
		}
		}

		return true;
	}


	public void imprimir() {
		System.out.println("1. A�adir un veh�culo al municipio\r\n"
				+ "2. Eliminar un veh�culo: si existen sanciones, debe mostrar el n�mero de las mismas y no realizar la eliminaci�n\r\n"
				+ "3. A�adir una sanci�n a un veh�culo\r\n"
				+ "4. Consultar las sanciones que tiene un veh�culo\r\n"
				+ "5. Eliminar las sanciones de un veh�culo\r\n"
				+ "6. Mostrar un listado de los veh�culos para los que la cuant�a de las sanciones es superior a una cantidad determinada (que se debe solicitar)\r\n"
				+ "7. Terminar el programa");
	}

	public void anadir() {
		 Vehiculo a =new Vehiculo(fichero);
		 try {
			PrintStream in = new PrintStream(new FileOutputStream(fichero));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			in.close();
		}
		 
	}
	

}
