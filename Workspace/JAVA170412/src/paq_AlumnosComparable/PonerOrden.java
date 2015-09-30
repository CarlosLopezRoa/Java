package paq_AlumnosComparable;
public class PonerOrden {

    @SuppressWarnings("unchecked")
     public static void ordenar(Object[] elementos, Criterio cr) {
		
		for(int i = elementos.length-1; i > 0; i--) { 		        
		   for(int j = 0; j < i; j++) {  
              if ( cr.comparar(elementos[j],elementos[j+1]) > 0 ) { // es 1, baja
			    	Object aux = elementos[j];
			    	elementos[j] = elementos[j+1];
					elementos[j+1] = aux;
			  } // if
			} // for
		} // for		
	} // Fin de ordenar
    
     public static void imprimir(Object[] arr) {
    
    	for (int i = 0; i < arr.length; i++) {
			System.out.println("- " + arr[i]);
		}
    } // Fin de imprimir
    
} // Fin de la clase PonerOrden