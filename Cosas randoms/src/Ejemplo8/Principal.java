package Ejemplo8;
/**
 * 
 * 8) Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y Revista. Las clases
deben estar implementadas con la jerarquía correcta.
Las características comunes de las revistas y de los libros son el código ISBN, el título, y el año de publicación. 
Los librostienen además un atributo prestado. Cuando se crean los libros, no están prestados.
Las revistas tienen un número. La clase Libro debe implementar la interfaz Prestable que tiene
los métodos presta, devuelve y estaPrestado.
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
