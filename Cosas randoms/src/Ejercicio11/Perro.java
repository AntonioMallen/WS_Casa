package Ejercicio11;

public class Perro implements animal {

		private String raza;
		private char comida; // puede ser l (en lata) o s (seca)
	
		public void setComida ( char comida ) {
			if( comida=='l' || comida == 's' ) {
				this.comida=comida;
			}else {
				throw new IllegalArgumentException("No existe ese tipo de comida");
			}
		}

		@Override
		public int getPreciobase() {
			
			return 0;
		}
	
}
