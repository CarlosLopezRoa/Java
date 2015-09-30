import java.util.*;
public class CStrings {
public static void main(String[] args) {
		
		String texto = "Este es un texto para eliminar espacios en blanco.";
		String sCadenaSinBlancos = "";		
		
		System.out.println("METODO POR MEDIO DE RECORRER TODO EL STRING.");
		System.out.println("Texto = " + texto);
		for (int x=0; x < texto.length(); x++) {
			  if (texto.charAt(x) != ' ')
			    sCadenaSinBlancos += texto.charAt(x);
		}
		System.out.println("Texto sin espacios en blanco = " + sCadenaSinBlancos);
		System.out.println("---------------------------------------------------");
		System.out.println("METODO CON AYUDA DE LA CLASE StringTokenizer.");
		
		texto = "Texto adicional para eliminar espacios.";
		System.out.println("Texto = " + texto);
		StringTokenizer st = new StringTokenizer(texto);
		sCadenaSinBlancos = "";
		while (st.hasMoreElements())
		  sCadenaSinBlancos += st.nextToken();
		System.out.println("Texto sin espacios en blanco = " + sCadenaSinBlancos);
		System.out.println("---------------------------------------------------");
	} // Fin de main
} 

