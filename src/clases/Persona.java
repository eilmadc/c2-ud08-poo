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
	public Persona() {
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
	public Persona(String nombre, int edad, String sexo) {
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
	public Persona(String nombre, String apellido, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	//METODOS DE CLASE
	// Imprimir atributos.
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}

	public void imprimirPersona() {
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Apellido : " + this.apellido);
		System.out.println("Edad : " + this.edad);
		System.out.println("DNI : " + this.dni);
		System.out.println("Sexo : " + this.sexo);
		System.out.println("Peso : " + this.peso);
		System.out.println("Altura = " + this.altura);
	}

	// GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
