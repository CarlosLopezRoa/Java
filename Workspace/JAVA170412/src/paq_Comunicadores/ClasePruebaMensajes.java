package paq_Comunicadores;

public class ClasePruebaMensajes {
	
	public static void main(String[] a) {
		
		/* Los objetos Telefono Celular, Paloma Mensajera y Telegrafo tienen una base com�n:
		   todos son 'IComunicador' y por lo tanto pueden ser asignados en variables de este
		   tipo  de datos */
		IComunicador o1 = new ClaseTelefonoCelular("Nokia");
		IComunicador o2 = new ClasePalomaMensajera("Paloma Blanca No.1");
		IComunicador o3 = new ClaseTelegrafo("Telegrafo UK", 1910);
		
		System.out.println("===  ClasePruebaManager  ==== \n");
		System.out.println("       Comunicadores");
		System.out.println("       _____________");
		System.out.println("- " + o1.toString());
		System.out.println("- " + o2.toString());
		System.out.println("- " + o3.toString() + "(" + ((ClaseReliquia)o3).getEdad() + " a�os).");
		System.out.println("--------------------------------------------------------------------");
		
		/* Los objetos o1,o2 y o3 s�lo pueden invocar al m�todo de la interface, es decir, el
		   m�todo (enviarMensaje), ya que �ste es el �nico m�todo definido en la interface
		   IComunicador. 
		   �Cu�l es la verdadera importancia de esto?  Utilizar una �nica variable para 
		     redireccionar el comunicador que necesitemos */
		
		IComunicador c = ClaseComunicadorManager.obtenerComunicador();
		c.enviarMensaje("ATENCI�N: LA INTERFACE FUNCION� CORRECTAMENTE.");
		
		/* A la clase 'ClasePruebaMensajes' le llega el mensaje sin importar cu�l fue
		   el tipo de Comunicador utilizado */
		 
	}

} // Fin de la clase ClasePruebaMensajes
