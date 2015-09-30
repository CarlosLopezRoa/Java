package paq_Comunicadores;
public class ClaseReliquia {

	private String nombre;
	private int a–oDeReliquia;
	
	public ClaseReliquia(String initialNombre, int initialA–oDeReliquia) {
		
		nombre = initialNombre;
		a–oDeReliquia = initialA–oDeReliquia;
	}
	
	public int getEdad() {

    	java.util.GregorianCalendar fecha = new java.util.GregorianCalendar();
    	int a–o = fecha.get(java.util.Calendar.YEAR);		 
		return  a–o - a–oDeReliquia; 	
    }
	
    public String toString() {
		
		return nombre + " A–o: " + a–oDeReliquia;
	}
} // Fin de la clase ClaseReliquia
