import java.util.*;

public class CMatriz {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos renglones quieres? ");
		int n = sc.nextInt();
		System.out.println("Cuántas columnas quieres? ");
		int m = sc.nextInt();
		
		// creo una matriz de n renglones por m columnas
		int matriz[][] = new int [n][m];
		
		int numAleatorio;
		for (int renglon = 0; renglon < n; renglon++) {  // primero ciclo sobre renglones
			for (int columna = 0; columna < m; columna++) { // luego ciclo sobre columnas
				numAleatorio = (int)(Math.random()*100);
				matriz[renglon][columna] = numAleatorio;
			} // for columna
		} // for renglon
		
		CMatriz.imprime(matriz);
	} // Fin de main
	
	private static void imprime(int m[][]) {
		
	    for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println("\n");
		}		
	} // Fin del método imprime
	
} // Fin de la clase CMatriz 

