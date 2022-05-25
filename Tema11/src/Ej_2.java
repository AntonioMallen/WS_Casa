
import java.io.*;
import java.util.*;


public class Ej_2 {

	public void leer() throws IOException {
		Scanner object1 = null;
		try {
			object1 = new Scanner(new FileReader ("A:\\NumerosPrimos.txt"));
			
				String result= object1.nextLine();
				System.out.println(result);

		}finally {
			if (object1!=null) {
				object1.close();
			}
		}
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		Ej_2 a = new Ej_2();
		a.leer();
	}

}
