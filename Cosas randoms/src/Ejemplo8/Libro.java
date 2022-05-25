package Ejemplo8;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;
	
	Libro(){
		prestado=false;
	}

	@Override
	public void presta() {
		this.prestado=true;
		
	}

	@Override
	public void devuelve() {
		this.prestado=false;
		
	}

	@Override
	public boolean estaPrestado() {
		return this.prestado;
		
	}
	
}
