package paqFechas;

	
	public class TestFecha {
		
	    public static void main(String[] args) {
			
	    	Fecha f = new Fecha(25,6,2011);  // creo un objeto fecha con datos iniciales
	    	
	    	System.out.println(f.toString());
	    	f.setDia(20);
	    	f.setMes(12);
	    	f.setAnio(2011);
	    	System.out.println(f.toString());
		} // Fin de main
	}
