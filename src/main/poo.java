package main;
import clases.Persona;
import clases.Password;
import clases.Electrodomesticos;
import clases.Serie;

/**
 * C2-UD08
 */

/**
 * @author elena-01
 *
 */
public class poo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Ejercicio 1
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Ana", 39, "MUJER");
		Persona persona3 = new Persona("Juan", "Diaz", 39, "11111111A","HOMBRE", 90 , 1.75  );
		System.out.println("____________________________________________________");
		System.out.println("\nClase PERSONA : ");
		System.out.println("--------------------");
		System.out.println("_____PERSONA 1______");
		persona1.imprimirPersona();
		System.out.println("______PERSONA 2______");
		persona2.imprimirPersona();
		System.out.println("______PERSONA 3______");
		persona3.imprimirPersona();
		
		// Ejercicio 2
		Password password1 = new Password();
		Password password2 = new Password(10);
		System.out.println("____________________________________________________");
		System.out.println("\nClase PASSWORD : ");
		System.out.println("--------------------");
		System.out.println("_____PASSWORD 1______");
		System.out.println(password1);
		System.out.println("_____PASSWORD 2______");
		System.out.println(password2);
		
		// Ejercicio 3
		Electrodomesticos electrodomesticos1 = new Electrodomesticos();
		System.out.println("____________________________________________________");
		System.out.println("\nClase ELECTRODOMESTICO : ");
		System.out.println("-------------------------");
		System.out.println("______ELECTRODOMESTICO 1______");
		electrodomesticos1.imprimirElectrodomestico();
		
		// Ejercicio 4
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("The Good Place", 4, "Comedia", "Michael Schur");
		System.out.println("____________________________________________________");
		System.out.println("\nClase SERIE : ");
		System.out.println("-------------------------");
		System.out.println("______Serie 1______");
		serie1.imprimirSerie();
		System.out.println("______Serie 2______");
		serie2.imprimirSerie();
		
	}

}
