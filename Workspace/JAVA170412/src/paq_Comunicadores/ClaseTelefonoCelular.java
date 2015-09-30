package paq_Comunicadores;

public class ClaseTelefonoCelular extends ClaseTelefono implements IComunicador {

	public ClaseTelefonoCelular(String initialMarca) {
		
		super(initialMarca);
	}
	
	public void enviarMensaje(String mensaje) {
		
		System.out.println("Ring Ring Ring Ring ...... Ring Ring Ring: "  + mensaje);
	}
	
}  // Fin de la clase ClaseTelefonoCelular

