package paq_AlumnosComparable;

public class TestCriterio {	

	public static void main(String[] args) {
		
		Alumno[] arr = { new Alumno("Jaime Rosas","12/03/1990",8.1),
				         new Alumno("Andrea Lomel’","05/11/1992",8.4),
				         new Alumno("Sandra Luna","26/10/1989",8),
				         new Alumno("Leopoldo G—mez","17/08/1994",9.3)
		               };
		System.out.println(" ===  TestCriterio  === \n");
		
		System.out.println("Ordenando por Nombre: ");
        PonerOrden.ordenar(arr, new CriterioAlumNombre());
        PonerOrden.imprimir(arr);
        System.out.println("----------------------------------------------");
        System.out.println("Ordenando por Promedio: ");
        PonerOrden.ordenar(arr, new CriterioAlumPromedio());
        PonerOrden.imprimir(arr);        
        System.out.println("----------------------------------------------");
        System.out.println("Ordenando por Edad: ");
        PonerOrden.ordenar(arr, new CriterioAlumEdad());
        PonerOrden.imprimir(arr);        
        System.out.println("----------------------------------------------");
	} // Fin de main
	
} // Fin de la clase TestCriterio

