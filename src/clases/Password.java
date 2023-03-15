/**
 * C2-UD08-Ejercicio2
 */
package clases;

import java.util.Random;

/**
 * @author elena-01
 *
 */
public class Password {

	// CONSTANTES con los caracteres y numero de caracteres para la obtención de
	// contraseña.
	final static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	final static int N_CARACTERES = CARACTERES.length();

	/*--ATRIBUTOS--*/
	private int longitud;
	private String contraseña;

	/**
	 * Constructor por defecto: sin parámetros
	 */
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}

	/**
	 * @param longitud
	 */
	public Password(int longitud) {

		this.longitud = longitud;
		this.contraseña = generaContraseña(longitud);

	}

	
	//METODOS DE CLASE
	public String generaContraseña(int longitud) {

		// String donde guardamos los caracteres a medida que los vayamos obteniendo de
		// forma aleatoria.
		String pass = "";

		/*
		 * Utilizamos libreria Random :
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
		 */
		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			pass += CARACTERES.charAt(random.nextInt(N_CARACTERES));
		}
		return pass;
	}
	
	
	//Imprimir Atributos
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	public void imprimirPassword() {
		System.out.println("LONGITUD : " + this.longitud);
		System.out.println("CONTRASEÑA :" + this.contraseña);
	}


	// GETTERS y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
