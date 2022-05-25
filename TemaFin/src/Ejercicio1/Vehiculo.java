package Ejercicio1;
/**
 * 
 * Clase con todos los datos de los vehiculos
 * 
 * @author Dhrazak
 *
 */

import java.util.*;

public class Vehiculo {

	String fichero;
	String matricula;
	String marca;
	String modelo;
	String propietario;
	String anno_matriculacion; // lo pongo como String para que se introduzca en formato 15/05/2022
	ArrayList<Multas> multas = new ArrayList<Multas>();

	Vehiculo( String arch ){
		fichero=arch;
		pedirDatos();
	}

	public void pedirDatos() {
		Scanner Sc = new Scanner(System.in);
		String matricula;
		do {
			System.out.println("Dime la matricula");
			matricula=Sc.next();
			if(comprobarMatricula(matricula)==false) {
				System.out.println("Matricula incorrecta");
			}
		}while(comprobarMatricula(matricula)==false);
		this.matricula=matricula;

		System.out.println("Dime la marca");
		this.marca=Sc.next();
		System.out.println("Dime el modelo");
		this.modelo=Sc.next();
		System.out.println("Dime el propietario");
		this.propietario=Sc.next();
		System.out.println("Dime el año de matriculacion");
		this.anno_matriculacion=Sc.next();
		System.out.println("Los datos han sido introducidos correctamente");
	}

	public boolean comprobarMatricula( String mat ) {
		boolean bien=true;
		boolean numbien=false;
		boolean parar = false;
		if(mat.length()==7) {
			for(int i = 0; i<mat.length() && bien==true; i++) {
				char Caracter=mat.charAt(i);
				if(i<4) {
					if(Caracter>='0' && Caracter<='9' ) {
						numbien=true;
					}
				}
				if(i>=4 && numbien==true) {
					if( ((Caracter>='A' && Caracter<='Z') || (Caracter>='a' && Caracter<='z')&&(Caracter!='ñ'|| Caracter!='Ñ' ))) {
						if(Caracter=='Q' || Caracter=='q') {
							bien=false;
						}else {
							bien = true;
							
						}
					}else {
						bien=false;
					}
				}
			}
		}else {
			bien = false;
		}
		return bien;
	}


	public String toString() {
		return matricula + "\t" + marca + "\t" + modelo + "\t" + propietario + "\t" + anno_matriculacion;
	}


}
