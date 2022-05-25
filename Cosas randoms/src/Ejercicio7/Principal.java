package Ejercicio7;
import java.io.*;
/**
 * Las amebas son seres unicelulares de forma cambiante ya que carecen de pared celular.
Fagocitan cualquier cosa que se les pone por delante. Crea la clase Ameba con el atributo
peso, un número entero que indica los microgramos que pesa: será un dato entero.
Cuando se crea la ameba su peso es de 3 microgramos. Al comer, va incrementando su
peso; gasta un microgramo en el proceso de fagocitar y el resto hace que aumente de
peso. Por ejemplo, si come una partícula de 6 microgramos miAmeba.come(6) engordaría
5 microgramos.
Una ameba se puede comer a otra ameba miAmeba.come(otraAmeba). En este caso,
sucede lo mismo que anteriormente, se gasta un microgramo en el proceso de fagocitado

y el resto lo engorda la ameba que come. Por ejemplo, si una ameba de 7 microgramos se
come a una de 4, acaba pesando 10 microgramos; la ameba comida no se destruye pero se
quedaría con un peso de 0 microgramos y ya no podría fagocitar nada. Pero si la ameba de
4 microgramos intenta comerse a la de 7, no puede.
 *
 * @author Dhrazak
 *
 */

public class Principal {

	public static void main(String[] args) throws IOException {
		try {
		Ameba m = new Ameba();
		Ameba a = new Ameba();
		m.come(2);
		m.come(a);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
