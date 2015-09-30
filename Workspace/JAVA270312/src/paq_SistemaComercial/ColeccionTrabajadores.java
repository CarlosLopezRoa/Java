package paq_SistemaComercial;

import java.util.*;

public class ColeccionTrabajadores implements Iterable<Trabajador> {
	
	ArrayList<Trabajador> coleccion;
	
	public ColeccionTrabajadores(){
		
		coleccion = new ArrayList<Trabajador>();
	}
	
	public void agregar(Trabajador t){
		
		coleccion.add(t);
	}

	public Trabajador obtener (String n){
		
		for (Trabajador t:coleccion){
			if (t.getNombre().equals(n)){
				return t;
			}
		}
		return null;
	}
	public Iterator<Trabajador> iterator(){
		
		return coleccion.iterator();
	}
	
	public String toString(){
		
		String cadena = "";
		for (Trabajador t:coleccion){
			cadena = cadena + t.toString() + "\n";
		}
		return cadena;
		
	}
}
