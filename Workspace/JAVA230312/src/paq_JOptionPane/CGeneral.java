package paq_JOptionPane;

import javax.swing.JOptionPane;  // el programa utiliza JOptionPane

public class CGeneral {

	   // el método main empieza la ejecución de la aplicación de Java
	   public static void main( String args[] )
	   {
	      String primerNumero;   // primera cadena introducida por el usuario
	      String segundoNumero;  // segunda cadena introducida por el usuario

	      double numero1;          // primer número a sumar
	      double numero2;          // segundo número a sumar
	      double suma;              // suma de numero1 y numero2

	      // leer el primer número del usuario como una cadena
	      primerNumero = JOptionPane.showInputDialog( "Escriba el primer entero" );

	      // leer el segundo número del usuario como una cadena
	      segundoNumero = 
	         JOptionPane.showInputDialog( "Escriba el segundo entero" );

	      // convertir los números de tipo String a tipo int
	      numero1 = Double.parseDouble( primerNumero ); 
	      numero2 = Double.parseDouble( segundoNumero );

	      // sumar los números
	      suma = numero1 + numero2;

	      // mostrar el resultado
	      JOptionPane.showMessageDialog( null, "La suma es " + suma, 
	         "Resultados", JOptionPane.PLAIN_MESSAGE );

	      System.exit( 0 );   // terminar aplicación con la ventana

	   } // fin del método main

	} // fin de la clase Suma



