/*
 * Esta es la clase acancion donde almacenaremos el titulo grupo la duracion y si se esta reproduciendo o no.
 */
public class Cancion {
	
	
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
/*
 * Crea una cancion vacia.
 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/*
 * Crea una cancion con titulo y su duracion.
 * @param titulo , es el titulo de la cancion, duracion , el tiempo que dura lacancion
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/*
 * Crea una cancion con titulo grupo duracion y si esta sonanco o no.
 * @param titulo , es el titulo de la cancion,grupo , el nombre del grupo ,duracion , el tiempo que dura lacancion
 * sonado, no dice si esta sonando o no lacacion
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}

	/*
	 * Este metodo nos cice si la cancion esta sonando o no esta sonando.
	 * @return true si esta la cancion sonando false si no esta sonado
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	
	/*
	 * Este metodo para la cancion si esta sonando y si no la deja parada. 
	 * @return no da false si la cancion no esta sonado ,y true si esta sonando
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	
	/*
	 * el getter del titulo de la cancion.
	 */
	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}
/*
 * El metodo setter del titulo de la cancion.
 * @param titulo de la cacion
 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * El metodo getter del grupo.
	 */
	public String getGrupo() {
		return grupo;
	}

	/*
	 * El metodo setter del grupo.
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
/*
 * El metodo getter de la duracion.
 */
	public int getDuracion() {
		return duracion;
	}
/*
 * el metodo setter de la duracion
 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
/*
 * El metodo getter de si esta sonando la cancion
 */
	public boolean isSonando() {
		return sonando;
	}
/*
 * El metodo setter de si la cancion esta sonando o no 
 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
/*
 * Es un metodo que nos compara si es la misma cancion si el titulo y el grupo es el mismo
 * @param cancion es la cancion 
 * @return true si la cancicion tiene el mismo titulo y grupo y false si no
 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
/*
 * Este metodo dandole un array de canciones no devuelbe la cancion que tiene mayor duracion.
 * nos devobera solo una si estan empatadas y sera la primera que encuentre en el array.
 * @parama canciones es un array de canciones
 * @return la cancion que dure mas tiemo
 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	
	/*
	 * Este metodo introduciendole una array decanciones y un titulo  
	 * @param Canciones array de canciones , titulo es el titulo de la cancion
	 * return el titulo de la siguente cacncion
	 */

	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}