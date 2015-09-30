package paqStat;

public class Promedios {
	
	public static void main(String args[]) {
		
		double arreglo[] = {5.5, 7, 8.5, 10, 7.2};	
			
		double promedio = Estadisticas.obtenerPromedios(arreglo);
		System.out.println("El promedio es " + promedio);
		
	} // Fin main

} // Fin de la clase Promedios

