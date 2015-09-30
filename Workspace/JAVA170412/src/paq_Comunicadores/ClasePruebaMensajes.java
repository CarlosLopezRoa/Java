package paq_Comunicadores;

public class ClasePruebaMensajes {
	
	public static void main(String[] a) {
		
		/* Los objetos Telefono Celular, Paloma Mensajera y Telegrafo tienen una base común:
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
		System.out.println("- " + o3.toString() + "(" + ((ClaseReliquia)o3).getEdad() + " años).");
		System.out.println("--------------------------------------------------------------------");
		
		/* Los objetos o1,o2 y o3 sólo pueden invocar al método de la interface, es decir, el
		   método (enviarMensaje), ya que éste es el único método definido en la interface
		   IComunicador. 
		   ¿Cuál es la verdadera importancia de esto?  Utilizar una única variable para 
		     redireccionar el comunicador que necesitemos */
		
		IComunicador c = ClaseComunicadorManager.obtenerComunicador();
		c.enviarMensaje("ATENCIÓN: LA INTERFACE FUNCIONÓ CORRECTAMENTE.");
		
		/* A la clase 'ClasePruebaMensajes' le llega el mensaje sin importar cuál fue
		   el tipo de Comunicador utilizado */
		 
	}

} // Fin de la clase ClasePruebaMensajes
