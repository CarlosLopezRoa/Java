package paqPersonas;

public class TestPersonas {
	
	public static void main (String[] args){
		
		 
		Persona p1 = new Persona("Carlos","26/07/1991");
		Persona p2 = new Persona("Carlos","23/07/1991");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		if (p1.equals(p2)){
			System.out.println("Son iguales");
		}else {
			System.out.println("Al diablo");
		}
	
		Musico m1 = new Musico("Tere","01/03/1991","Saxof—n");
		System.out.println(m1.toString());
		if (m1.equals(p1)){
			System.out.println("son iguales");
		}
		m1.tocarInstrumento();
	}

		
}// Fin de la clase TestPersonas
