package paq_IndependizarElPaq;

import java.util.Collection;

/**
 * Clase para mostrar el uso de la interface Collection.
 * @author Gerardo Rodr’guez Rojano
 * @version 2.0
 */
public class TestCollectionV2 {

	public static void main(String[] args) {
		
		Collection<String> coleccion = UNombres.obtenerLista();
		
		System.out.println("=== TestCollection === v.2");
		for (String s : coleccion)
			TestCollectionV2.imprime(s);
	} // Fin de main
	
	private static void imprime(String s) {
		
		String guion = "- ";
		System.out.println(guion + s);
	} // Fin de imprime
	
} // Fin de la clase TestCollectionV2
