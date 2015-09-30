package paq_AlumnosComparable;


public class Alumno {

	private String nombre;
	private String fechaNacimiento;
	private double promedio;
	
	public Alumno(String initNombre, String initFechaNacimiento, double initPromedio) {
		
		nombre =  initNombre;
		fechaNacimiento = initFechaNacimiento;
		promedio = initPromedio;
	} // Constructor
	
	public String getNombre() {
	
		return nombre;
	}
	
	public double getPromedio() {
		
		return promedio;
	}
	
	/**
	 * Obtiene el a–o del sistema y le resta el a–o de la fecha de nacimiento.
	 * @return edad del alumno.
	 */
	public int getEdad() {
		
		java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
		int anio = gc.get(java.util.Calendar.YEAR);
		return anio - Integer.parseInt(fechaNacimiento.split("/")[2]);
	}
	
	public String toString() {
		
		return "[" + nombre + ", " + this.getEdad() + ", " + promedio + "]";
	}
	
} // Fin de la clase Alumno
