package paq_Enumerados;

public class EnumDiaDeLaSemana {

	enum dia_de_la_semana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO } 
	
	public static void main(String[] args) {
	
		dia_de_la_semana dia = dia_de_la_semana.LUNES;
		
		if ( dia == dia_de_la_semana.SABADO || dia == dia_de_la_semana.DOMINGO ) {
			System.out.println("El dia es fin de semana.");
		} else
			System.out.println("El dia no es fin de semana.");
		System.out.println("-----------------------------------------------------------------");
		
	} // Fin de main
	
} // Fin de la clase EnumDiaDeLaSemana

