package colecciones;

import java.util.*;

public class ColeccionArrayList {

	ArrayList<Object> coleccion;
	
	public ColeccionArrayList() { //Constructor de la clase
		coleccion = new ArrayList<Object>();  	
	}
	public ArrayList<Object> getColeccion() {
		return coleccion;
	}
	
	public int getNumElementos() {
		return coleccion.size();
	}
	
	public Object getElemento(int indice) {
		return coleccion.get(indice);
	}
	
	public void anadir(Object obj) {
		coleccion.add(obj);
	}
}
