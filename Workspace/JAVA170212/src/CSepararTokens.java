
public class CSepararTokens {
	
public static void main(String[] args) {
		
		String texto = "Juan;Tere; Paco;   Luis;           Lucia;                        Gabriel.";
		
		String[] tokens = texto.split(";\\s*");
		for (String token:tokens) 
			System.out.println(token);

		System.out.println();
		System.out.println("----------- o con este tipo de for --------");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	} // Fin de main

}
