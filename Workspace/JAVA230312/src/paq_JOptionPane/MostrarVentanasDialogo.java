package paq_JOptionPane;


import javax.swing.JOptionPane;  // el programa utiliza JOptionPane

public class MostrarVentanasDialogo {

   public static void main( String args[] )   {
      
      JOptionPane.showMessageDialog( null, "Letrero del proceso", 
	     "Titulo de la Ventana", JOptionPane.ERROR_MESSAGE );
      JOptionPane.showMessageDialog( null, "Letrero del proceso", 
 	     "Titulo de la Ventana", JOptionPane.INFORMATION_MESSAGE );
      JOptionPane.showMessageDialog( null, "Letrero del proceso", 
 	     "Titulo de la Ventana", JOptionPane.WARNING_MESSAGE );
      JOptionPane.showMessageDialog( null, "Letrero del proceso", 
    	 "Titulo de la Ventana", JOptionPane.QUESTION_MESSAGE );
      JOptionPane.showMessageDialog( null, "Letrero del proceso", 
         "Titulo de la Ventana", JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );   // terminar aplicaci�n con la ventana

   } // fin del m�todo main

} // fin de la clase MostrarVentanasDialogo