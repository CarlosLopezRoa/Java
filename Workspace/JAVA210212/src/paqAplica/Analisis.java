package paqAplica;

import java.util.Scanner;
import paqMat.*;

public class Analisis {

	public static void main(String[] args){
		
		int[] arreglo = new int[5];
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== Sistema de an‡lisis de datos \n");
		System.out.println("Dame los nœmeros que voy a sumar");
		int i = 0;
		while (i != (-1)) {
			System.out.println("Ingresa el valor (Terminar con -1)");
			i = sc.nextInt();
			arreglo [pos++] = i;
		}
		Operaciones obj1 = new paqMat.Operaciones();
		obj1.imprimeDatos(arreglo);
		System.out.println("La suma de la lista es " + obj1.sumar(arreglo));
		System.out.println("El promedio de la lista es " + obj1.promedio(arreglo));

	
		
		
	
		
	}
} // Fin de la clase analisis
