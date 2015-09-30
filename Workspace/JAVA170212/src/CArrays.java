import java.util.*;
public class CArrays {
    
    public static void main(String[] args) {
    	
    	int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        int v = sc.nextInt();
        int i = 0;
     
        while ( v!=0 && i<10 ) {
        	arr[i++] = v; // asigno 'v' a la posicion [i] y luego incremento i en 1        	
        	System.out.println("Ingrese el siguiente valor, tecle 0 para salir.");
            v = sc.nextInt();       	
        } // fin while
        
        for (int j = 0; j < i; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}                
	} // fin de main

}
