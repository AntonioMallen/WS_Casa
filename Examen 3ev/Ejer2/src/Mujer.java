

import java.io.Serializable;

public class Mujer extends Contacto implements Serializable{
	
	private int hijos;
	
	public Mujer(String nombre, String apellido, int hijos) {
		super(nombre,apellido);
		this.hijos=hijos;
	}
	
	public String toString() {
		return super.toString()+" Sexo: mujer "+"Hijos: "+this.hijos;
	}
	
}
