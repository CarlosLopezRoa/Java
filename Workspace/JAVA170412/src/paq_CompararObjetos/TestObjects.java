package paq_CompararObjetos;


public class TestObjects {

	public static void main(String[] args) {
		
		String s = "Barco";
		Character c = 'h';
		Integer i = 199;
		Double d = 124.7;
		
		System.out.println((s.equals("Barco")? "IGUALES":"DIFERENTES"));
		System.out.println((c.equals('h')? "IGUALES":"DIFERENTES"));
		System.out.println((i.equals(199)? "IGUALES":"DIFERENTES"));
		System.out.println((d.equals(124.7)? "IGUALES":"DIFERENTES"));
	} // Fin de main
	
} // Fin de la clase TestObjects
