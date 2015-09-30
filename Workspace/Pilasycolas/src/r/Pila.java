package r;
import java.util.*; // Librerias

public class Pila {

	// Main
	public static void main(String[] args)
	{
		// Generamos la pila y el Scanner
		Stack<String> pila= new Stack<String>();
		Scanner sc=new Scanner(System.in);
	
		// Pedimos al usuario la l’nea a invertir.
		System.out.println("\tEste programa considera los espacios como el separador para invertir la oraci—n.");
		System.out.println("\tPor favor ingresa una l’nea de texto a invertir.");
		
		//  Separamos las palabras mediante un espacio.
		String[] te=sc.nextLine().split(" ");
		
		// For para a–adir a la pila.
		for(int i=0; i<te.length;i++)
			pila.add(te[i]);
		
		// For para sacar e imprimir en pantalla de la pila.
		for(;!pila.empty();)
			System.out.print( pila.pop()+" ");

} // Fin del main

}// Fin de la clase Pila.