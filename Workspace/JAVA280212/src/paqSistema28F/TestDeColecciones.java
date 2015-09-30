package paqSistema28F;
import java.util.*;

import colecciones.*;

public class TestDeColecciones {

	public static void main(String[] args) {
		//Test de coleccion con arreglos
		Coleccion c = new Coleccion();
		Integer objInt = new Integer(99);
		c.anadir(objInt);
		System.out.println("Valor de objInt = " + c.getElemento(0));
		System.out.println("Numero de elementos = " + c.getNumElementos());
		Object [] lista;
		lista = c.getColeccion();
		System.out.println("lista en la posici—n cero = " + lista[0].toString() );
		
		Object o;
		o = c.getElemento(0);
		System.out.println("o = " + o.toString());
		//--------------------------
		//Test de coleccion con ArrayList
		ColeccionArrayList c2 = new ColeccionArrayList();
		objInt = new Integer(199);
		c2.anadir(objInt);
		System.out.println("Valor de objInt = " + c2.getElemento(0));
		System.out.println("Numero de elementos = " + c2.getNumElementos());
		ArrayList<Object> lista2;
		lista2 = c2.getColeccion();
		System.out.println("lista en la posici—n cero = " + lista2.get(0) );
		
		Object o2;
		o2 = c2.getElemento(0);
		System.out.println("o = " + o2.toString());
	} 
}// Fin de la clase TestDeColecciones
