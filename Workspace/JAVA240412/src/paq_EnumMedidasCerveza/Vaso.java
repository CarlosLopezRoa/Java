package paq_EnumMedidasCerveza;

public enum Vaso {
	
	// Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
	
	JARRA(500), TUBO(250), TERCIO(333), CA„A(200);  // elementos del conjunto
	private int cc; // Variable interna donde almacenaremos la capacidad
	
	// Nuestro constructor nos fuerza a pasar par‡metros al definir un nuevo tipo
	
	Vaso(int cc) {
		
		this.cc = cc;
	}
	
	// Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
    	
    	return cc;
    }
    
    public String medida(Vaso v) {
    	
    	String r = "No se nada de esto.";
    	
    	if ( v.name().equals("CA„A") ) {
    	   r = "Es un vaso delgado.";
    	} else if ( v.name().equals("JARRA") ) {
    		r = "Una completa jarra de 1/2 litro.";
    	} else if ( v.name().equals("TERCIO") ) {
    		r = "Es 1/3 de litro.";
    	} 
    	return r;
    }
} // Fin enum Vaso

