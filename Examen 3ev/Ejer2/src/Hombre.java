

import java.io.Serializable;

public class Hombre extends Contacto implements Serializable{

	private boolean barba;
	
	public Hombre(String nombre, String apellido,boolean barba) {
		super(nombre,apellido);
		this.barba=barba;
	}
	
	public String toString() {
		return super.toString()+" Sexo: hombre "+"Barba: "+this.barba;
	}
	
}
