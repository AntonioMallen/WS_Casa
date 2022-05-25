

import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		try {
			Menu m = new Menu("agenda.dat");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
