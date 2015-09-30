package paqPersonas;

public class Persona {

	private String nombre;
	private String fechaNacimiento;
	
	public Persona(String initNombre, String initFechaNac){
		nombre = initNombre;
		fechaNacimiento = initFechaNac;
	} //Fin del contructor
	
	public String toString(){
		return nombre + " " + fechaNacimiento;
	}
	
	public boolean equals (Object o) {
		Persona temp = (Persona)o;
		if (temp.nombre.equals(this.nombre)){
			if (temp.fechaNacimiento.equals(this.fechaNacimiento))
				return true;
			else
				return false;
		} else 
			return false;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getFechaNac(){
		return fechaNacimiento;
	}
}// Fin de la clase Persona
