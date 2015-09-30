package paq_JOptionPane;

import javax.swing.JOptionPane;  // el programa utiliza JOptionPane

public class CGeneral {

	   // el m�todo main empieza la ejecuci�n de la aplicaci�n de Java
	   public static void main( String args[] )
	   {
	      String primerNumero;   // primera cadena introducida por el usuario
	      String segundoNumero;  // segunda cadena introducida por el usuario

	      double numero1;          // primer n�mero a sumar
	      double numero2;          // segundo n�mero a sumar
	      double suma;              // suma de numero1 y numero2

	      // leer el primer n�mero del usuario como una cadena
	      primerNumero = JOptionPane.showInputDialog( "Escriba el primer entero" );

	      // leer el segundo n�mero del usuario como una cadena
	      segundoNumero = 
	         JOptionPane.showInputDialog( "Escriba el segundo entero" );

	      // convertir los n�meros de tipo String a tipo int
	      numero1 = Double.parseDouble( primerNumero ); 
	      numero2 = Double.parseDouble( segundoNumero );

	      // sumar los n�meros
	      suma = numero1 + numero2;

	      // mostrar el resultado
	      JOptionPane.showMessageDialog( null, "La suma es " + suma, 
	         "Resultados", JOptionPane.PLAIN_MESSAGE );

	      System.exit( 0 );   // terminar aplicaci�n con la ventana

	   } // fin del m�todo main

	} // fin de la clase Suma



