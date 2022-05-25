import java.io.Serializable;

public class Objetoprueba implements Serializable {
	private String nombre;
	private String contra;
	
	public Objetoprueba(String nombre, String contra){
		this.nombre=nombre;
		this.contra=contra;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContra() {
		return contra;
	}
	
	
}
