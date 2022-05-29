package Ejercicio3;

public class Socio {
	
	private String nombre, apellidos, fechaAlta ,tipo;
	private int numeroSocio;

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setNumeroSocio(int númeroSocio) {
		this.numeroSocio = númeroSocio;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Socio(String nom, String ape) {
		this.nombre=nom;
		this.apellidos=ape;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
}
