package Ejemplo8;
/**
 * 
 * 8) Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y Revista. Las clases
deben estar implementadas con la jerarqu�a correcta.
Las caracter�sticas comunes de las revistas y de los libros son el c�digo ISBN, el t�tulo, y el a�o de publicaci�n. 
Los librostienen adem�s un atributo prestado. Cuando se crean los libros, no est�n prestados.
Las revistas tienen un n�mero. La clase Libro debe implementar la interfaz Prestable que tiene
los m�todos presta, devuelve y estaPrestado.
 * 
 * @author Dhrazak
 *
 */

public class Principal {

	public static void main(String[] args) {
		 Libro a = new Libro();
		 a.setISBN("978-92-95055-02-5");
		 
	}

}
