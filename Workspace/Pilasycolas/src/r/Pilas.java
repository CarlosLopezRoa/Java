package r;

import java.util.*;

public class Pilas {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Scanner intro = new Scanner(System.in);
		
		System.out.println("-------\n Sistema inversor de oraciones separadas por espacios \n Ingrese una oraci�n a invertir");
		
		String[] texto = intro.nextLine().split(" ");
		
		for (int i = 0; i < texto.length; i++) {
			stack.add(texto[i]);
		}
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
}
