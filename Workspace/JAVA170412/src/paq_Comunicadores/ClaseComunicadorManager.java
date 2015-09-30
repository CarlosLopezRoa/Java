package paq_Comunicadores;

public class ClaseComunicadorManager {
	
	/**
	 * M�todo que regresa una referencia a un Objeto que implementa la interface
	 * IComunicador.
	 * @return referencia a un Objeto que implementa la interface IComunicador.
	 */
	public static IComunicador obtenerComunicador() {
			
		// una paloma mensajera es un IComunicador
		//return new ClasePalomaMensajera("Paloma Weiss No.32");
		return new ClaseTelefonoCelular("Sony-Ericson");
		//return new ClaseTelegrafo("Tel�grafo Alem�n m123", 1931);
	}

} // Fin de la clase ClaseComunicadorManager
