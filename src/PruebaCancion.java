public class PruebaCancion {
	
	/*
	 * vlbvlalslas
	 * @version 2.12
	 * @author clara
	 */
	public static void main(String[] args) {
		
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
	
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}
	/*
	 * El metodo no dice cual sera la siguiente cancion
	 * @param Cancion ,es la cancion que sonara despues, Cancion[], es el array de canciones
	 */

	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/* 
	 * El metodo nos dara la cancion mas larga
	 * @param Cancion[], es el array de canciones
	 */

	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}
/*
 * el metodo nos da el autor y el titulo de la cancion
 * @param Cancion[], es el array de canciones
 */

	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}