package colecciones;

public class Coleccion {
	private Object[] coleccion; //Es un Set de objetos
	private int numElementos; //Indica el num de objetos dentro 
	
	public Coleccion() { //Constructor de la clase
		coleccion = new Object[10];  
		numElementos = 0;
	}
	
	public Object[] getColeccion() {
		return coleccion;
	}
	
	public int getNumElementos() {
		return numElementos;
	}
	
	public Object getElemento(int indice) {
		return coleccion[indice];
	}
	
	public void anadir(Object obj) {
		coleccion[numElementos++] = obj;
	}
}
