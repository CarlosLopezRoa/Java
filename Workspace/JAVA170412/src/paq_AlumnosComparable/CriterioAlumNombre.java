package paq_AlumnosComparable;

public class CriterioAlumNombre extends Criterio<Alumno> {

	public int comparar(Alumno a, Alumno b) {
	
		return a.getNombre().compareTo(b.getNombre());
	}
	
} // Fin de la clase CriterioAlumNombre


