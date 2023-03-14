/**
 * 
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Serie {

	/** -- Atributos -- */
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	/**
	 * Constructor sin parámetros
	 */
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	/**
	 * @param titulo
	 * @param numeroTemporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	/* Imprimir atributos */
	public void imprimirSerie() {
		System.out.println("Titulo : " + this.titulo);
		System.out.println("Numero Temporadas : " + this.numeroTemporadas);
		System.out.println("Entregado : " + this.entregado);
		System.out.println("Genero : " + this.genero);
		System.out.println("Creador : " + this.creador);
	}

	// GETTERS y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}
