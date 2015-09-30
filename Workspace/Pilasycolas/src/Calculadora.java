import java.util.Scanner;
import java.util.Stack;


public class Calculadora {
	
	public static void main(String[] args) {
		
		Stack<String> Calculadora = new Stack<String>();
		Stack<String> Operacion = new Stack<String>();
		Stack<String> Operandos = new Stack<String>();
		
		Scanner entrada = new Scanner(System.in);
		
		String[] in = entrada.nextLine().split(" ");
		
		for (int i = 0; i < in.length; i++) {
			Calculadora.add(in[i]);
		}
		
		while(!Calculadora.empty()){
			
			if(Calculadora.peek().equals("+") || Calculadora.peek().equals("-") || Calculadora.peek().equals("+") || Calculadora.peek().equals("/"))
				Operacion.add(Calculadora.pop());
			else
				Operandos.add(Calculadora.pop());
		}
		
		while(!Operacion.empty()){
			
		}
	}
	
	
	
}
