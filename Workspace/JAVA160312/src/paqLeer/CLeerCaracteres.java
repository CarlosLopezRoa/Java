package paqLeer;

import java.util.*;
import java.io.*;

public class CLeerCaracteres {

	public static void main(String[] args) {
		
		ArrayList<Character> cadena = new ArrayList<Character>();
		String texto = "";
		StringBuffer buffer = new StringBuffer();
		char[] arreglo = new char[40];
		int indexArreglo = 0;
		int car;
		char caracter;
		
		try {
			System.out.println("Introducir un texto: ");
			while ( ( car = System.in.read() ) != '\r' ){ // mientras no se oprima <enter>
				caracter = (char) car;
				cadena.add( caracter );   // salvar el caracter
				texto = texto + caracter;
				buffer.append(caracter);
				arreglo[indexArreglo++] = caracter;
			}
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}	
		System.out.println("SALIDA:");
		imprime(cadena);
		imprime(texto);	
		imprime(buffer.toString());
		imprime(arreglo, indexArreglo);
	} // Fin main
	
	private static void imprime(ArrayList<Character> l) {
		
		for ( char c:l) {
			System.out.print(c);
		}
		System.out.println(".");
	}
	
	private static void imprime(String t) {
		
		System.out.println(t + ".");
	}
	
	private static void imprime(char[] a, int index) {
		
		for (int i = 0; i < index; i++) {
			System.out.print( a[i]);
		}
		System.out.println(".");
	}
		
} // Fin de Clase CLeerCaracteres
