package paq_Comunicadores;

public class ClaseTelegrafo extends ClaseReliquia implements IComunicador {
	
   	
	   public ClaseTelegrafo(String initialNombre, int initialA–oDeReliquia) {
		 
		   super(initialNombre,initialA–oDeReliquia);
	   }

	   public void enviarMensaje(String mensaje) {
			
			System.out.println("Chic Chic Chic ... Chic Chic Chic :" + mensaje);
		}
	   
	}  // Fin de la clase ClaseTelegrafo
