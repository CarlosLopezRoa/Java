package paq_JOptionPane;
//Fig. 2.6: Bienvenido4.java
//Imprimir varias líneas de texto en un cuadro de diálogo.

//paquetes de Java
import javax.swing.JOptionPane;  // el programa usa JOptionPane

public class Bienvenido4 {

 // el método main empieza la ejecución de la aplicación de Java
 public static void main( String args[] )
 {
    JOptionPane.showMessageDialog( 
       null, "Bienvenido\na\nla programacion\nen Java!" );

    System.exit( 0 );  // terminar la aplicación con la ventana

 } // fin del método main

} // fin de la clase Bienvenido4

