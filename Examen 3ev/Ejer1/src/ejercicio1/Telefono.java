package ejercicio1;

import java.io.Serializable;

public class Telefono implements Serializable{

	private String numero;
	private String descripcion;

	public Telefono(String numero,String desc){
		if ( numeroLargo(numero) || numeroCorto(numero) ) {
			this.numero = numero;
			this.descripcion=desc;
		}else {
			System.out.println("Numero de telefono no valido");
		}
	}


	public String getNumero() {
		return numero;
	}

	public boolean numeroLargo(String numero) {
		final int LONGTFNOLARGO = 13;
		boolean tfnoValido = false;
		if(numero.length()==13) {
			for(int i = 0; i < LONGTFNOLARGO; i++) {
				if(i == 0 && numero.charAt(i) == '+') {
					tfnoValido = true;
				}
				else if(i == 3 && numero.charAt(i) == ' ') {
					tfnoValido = true;
				}
				else if(numero.charAt(i) >= '0' &&
						numero.charAt(i) <= '9') {
					tfnoValido = true;
				}else {
					return false;
				}
			}
		}
		return tfnoValido;	
	}

	public static boolean numeroCorto(String numero) {
		final int LONGTFNOCORTO = 9;
		boolean tfnoValido = false;
		if(numero.length()==9) {
			for(int i = 0; i < LONGTFNOCORTO; i++) {
				if(numero.charAt(i) >= '0' &&
						numero.charAt(i) <= '9') {
					tfnoValido = true;
				}
			}
		}
		return tfnoValido;
	}

	public void setNumeroCorto(String tipo) {
		this.numero = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}






}
