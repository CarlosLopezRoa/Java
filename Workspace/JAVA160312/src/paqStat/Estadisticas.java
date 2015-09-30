package paqStat;

public class Estadisticas {

	/**
	 *  Procedimiento No Est‡tico  para obtener el promedio de una lista de numeros
	 *
	 *  @return regresa el promedio de calificaciones
	 */
	public static double obtenerPromedios( double[] lista )  {

	    int  n = 0;
	    double suma = 0;
	    while (n < lista.length) {  // mientras haya nœmeros que considerar
	    	 suma = suma + lista[n];
	         n++;
	    }
	    return (suma / n);

	} // Fin de obtenerPromedios
	
} // Fin de la clase Estadisticas
