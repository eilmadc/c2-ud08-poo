/**
 * C2-UD08-Ejercicio3
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Electrodomesticos {
	
	/**Constantes */
	final static String[] TIPO_CONSUMO_ENERGETICO = {"A", "B","C","D","E","F"};
	final static String[] COLORES = {"blanco","negro","rojo","azul","gris"};

	/**-- Atributos heredables--*/
	protected double precioBase;
	protected String color;
	protected String consumoEnergetico; 
	protected double peso;
	
	/**
	 * Constructor por defecto : sin parámetros. 
	 */
	public Electrodomesticos() {
		this.precioBase = 100;//precio base de Electrodoméstico :  medido en €
		this.color = COLORES[0];//color de electrodomestico = blanco
		this.consumoEnergetico =TIPO_CONSUMO_ENERGETICO[5];//tipo de consumo energetico de electrodomestico
		this.peso = 5;//peso de electrodoméstico : medido en Kg
	}

	/**
	 * Constructor por defecto : con parámetros. 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLORES[0];
		this.consumoEnergetico =TIPO_CONSUMO_ENERGETICO[5];
		this.peso = peso;
	}

	/**
	 * Constructor por defecto : con todos los parámetros. 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomesticos(double precioBase, String color, String consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	
	
	
}
