package paq_AlumnosComparable;

public class CriterioAlumEdad extends Criterio<Alumno> {

	public int comparar(Alumno a, Alumno b) {
		
		double diff = a.getEdad() - b.getEdad();
		return diff > 0 ? 1 : diff < 0 ? -1 : 0;
	}
	
} // Fin de la clase CriterioAlumEdad
