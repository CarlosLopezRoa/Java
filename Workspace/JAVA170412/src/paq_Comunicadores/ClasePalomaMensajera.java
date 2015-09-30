package paq_Comunicadores;

public class ClasePalomaMensajera extends ClasePaloma implements IComunicador {

	public ClasePalomaMensajera(String initialNombre ) {
		
		super(initialNombre);
	}
	
    public void enviarMensaje(String mensaje) {
		
		System.out.println("Guuh Guuh Guuh ...... Mensaje en la Pata: " + mensaje);
	}
	
} // Fin de la clase ClasePalomaMensajera
