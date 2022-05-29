package Ejercicio3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			Menu m = new Menu("Socios.dat","Reservas.dat");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
