package Ejercicio7;
import java.io.*;

public class Ameba {

	private int peso =3;
	
	Ameba(){
		System.out.println(toString());
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public int getPeso() {
		return this.peso;
	}

	
	public void come(int peso) {
		this.peso+=peso;
		System.out.println(toString());
	}
	
	public void come(Ameba a) throws IOException {
		if(peso<a.getPeso()) {
			throw new IOException("No puede comerse una ameba de menor peso a una de mayor");
		}
		if(peso>a.getPeso()) {
			
			peso+=a.getPeso();
			peso--;
			a.setPeso(0);
			System.out.println(toString());
		
		}
		if(peso==a.peso) {
			throw new IOException("Las dos amebas pesan lo mismo");
		}
	}
	
	public String toString() {
		return "Ahora la ameba pesa "+ getPeso();
	}
}
