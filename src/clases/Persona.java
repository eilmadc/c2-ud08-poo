/**
 * C2-UD08-Ejercicio1
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Persona {

	final static String SEXO = "hombre";

	/*--ATRIBUTOS--*/
	private String nombre; // nombre de persona
	private String apellido;// apellidos de persona
	private int edad;// apellido de persona
	private String dni;// dni de persona
	private String sexo;// sexo de persona
	private double peso;// peso de persona
	private double altura;// altura de persona

	/*-- Constructor por defecto: sin parámetros --*/
	private Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * Constructor: con los siguientes parámetros
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	private Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	/**
	 * -- Constructor: con todos los parámetros
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param dni
	 * @param sexo
	 * @param peso
	 * @param altura   --
	 */
	private Persona(String nombre, String apellido, int edad, String dni, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

}
