package paq_SistemaComercial;

public class Persona {

	private String nombre;
	private String fechaNac;
	
	public Persona(String initNombre, String initfechaNac){
		nombre = initNombre;
		fechaNac = initfechaNac;
		
	}
	
	public String  getNombre(){
		
		return nombre;
	}
	
	public String toString(){
		return nombre + " " + fechaNac;
	}
}
