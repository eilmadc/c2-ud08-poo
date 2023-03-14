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
	
	//CONSTANTES con los caracteres y numero de caracteres para la obtención de contraseña.
	final static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	final static int N_CARACTERES = CARACTERES.length(); 
	
	/*--ATRIBUTOS--*/
	private int longitud;
	private String contraseña;

	/**
	 * Constructor por defecto: sin parámetros
	 */
	private Password() {
		this.longitud = 8;
		this.contraseña = "";
		System.out.println("LONGITUD : "+this.longitud);
		System.out.println("CONTRASEÑA :"+this.contraseña);
	}

	/**
	 * @param longitud
	 */
	private Password(int longitud) {

		this.longitud = longitud;
		this.contraseña = generaContraseña(longitud);
		System.out.println("LONGITUD : "+this.longitud);
		System.out.println("CONTRASEÑA :"+this.contraseña);
	}

	private String generaContraseña(int longitud) {
		
		//String donde guardamos los caracteres a medida que los vayamos obteniendo de forma aleatoria.
		String pass="";
		
		/*
		 * Utilizamos libreria Random : https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
		 */
		Random random = new Random();
		
		for (int i = 0; i < longitud; i++) {
			pass += CARACTERES.charAt(random.nextInt(N_CARACTERES));
		}
		return pass;
	}
}
