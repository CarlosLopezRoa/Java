package paq_enumJaquieBarker;

public class Estudiante {

	private String nombre;
	private int expediente;
	private EnumEspecialidad especialidad;
	
	public Estudiante(String initNombre, int initExpediente, EnumEspecialidad initEspecialidad) {
		
		nombre = initNombre;
		expediente = initExpediente;
		especialidad = initEspecialidad; 
	} // Constructor
	
	public String getNombre() {
		return nombre;
	}
	
	public int getExpediente() {
		return expediente;
	}
	
	public EnumEspecialidad getEspecialidad() {
		return especialidad;
	}
	
	public String toString() {
		
		return "[" + nombre + ", " + expediente + ", " + especialidad.name() + "]"; 
	}
	
} // Fin de la clase Estudiante
