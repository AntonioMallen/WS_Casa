package Ejemplo8;

public abstract class Publicacion {

	private String ISBN;
	private String titulo;
	private int ano_publicacion;
	
	
	
	public void setISBN( String codigo) {
		// Puede ser de hasta 24 numeros + 4 barras de separadores("-") y como minimo puede tener 7 numeros + 4 barras de separador
		if( codigo.length() < 28 && codigo.length() > 11) {
			this.ISBN=codigo;
		}else {
			throw new IllegalArgumentException("El codigo ISBN no es correcto");
		}
	}
	

}
