package paq_AlumnosComparable;

public class CriterioAlumPromedio extends Criterio<Alumno> {

	public int comparar(Alumno a, Alumno b) {
	
		double diff = a.getPromedio() - b.getPromedio();
		return diff > 0 ? 1 : diff < 0 ? -1 : 0;
	}
	
} // Fin de la clase CriterioAlumPromedio
