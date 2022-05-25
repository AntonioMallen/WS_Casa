
import java.util.*;
import java.io.*;

public class Ej_1 {

	ArrayList<Integer> vector = new ArrayList<Integer>();
	
	public void rellenar() {
		for(int i = 2;i<=500;i++) 
			vector.add(i);
	}
	
	
	
	/** LinkedHashSet e  LinkedHashSet oe ( e< o o%e==0)    */
	public void criba() {
		 int maximo=vector.size();
		 int primo= 2;
		 int contador=1;
		 while(primo*primo<maximo) {
		Iterator<Integer> iteradorprimo= vector.iterator();
		for(int i=1;i<=contador;i++) {
			primo= iteradorprimo.next();
		}
		 
		 Iterator<Integer> iteradorcriba= vector.iterator();
		 while(iteradorcriba.hasNext()) {
			 int posibleprimo=iteradorcriba.next();
				if(posibleprimo%primo==0&&posibleprimo>primo) {
					iteradorcriba.remove();
				 	}			
			}
		 contador++;
		 }
		 
		 }
	public void almacenar() throws IOException{
		FileWriter archivo = null;
		
			try {
				archivo= new FileWriter("A:\\NumerosPrimos.txt");
				for (int num=0; num<vector.size();num++) {
					archivo.write(vector.get(num)+" ");
				}
				
			}finally {
				if (archivo!=null) {
					archivo.close();
				}
			}
	}	 
	
	public static void main(String[] args) throws IOException {
	Ej_1 a= new Ej_1();
	a.rellenar();
	a.criba();
	a.almacenar();
	}

}
