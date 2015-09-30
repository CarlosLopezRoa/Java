package paq_EnumMedidasCerveza;
public class TestBebidasDeCerveza {
	
	public static void main(String[] args) {
		
		// Una bebida
		BebidaCerveza bebida = new BebidaCerveza(BebidaCerveza.MarcaCerveza.AMBAR, Vaso.JARRA);
		
		System.out.println("Una bebida:");
		bebida.servir();
		
		// Muchas bebidas
		BebidaCerveza[] bebidas = { new BebidaCerveza(BebidaCerveza.MarcaCerveza.HEINEKEN, Vaso.TERCIO),
                                    new BebidaCerveza(BebidaCerveza.MarcaCerveza.GUINNESS, Vaso.TERCIO),
                                    new BebidaCerveza(BebidaCerveza.MarcaCerveza.HEINEKEN, Vaso.CAÑA),
                                    new BebidaCerveza(BebidaCerveza.MarcaCerveza.AMBAR, Vaso.JARRA)};
		System.out.println("\nMuchas bebidas:");
		for (BebidaCerveza b:bebidas) 
			b.servir();
		
		System.out.println("\nQué me dices de ...");
		for (int i = 0; i < bebidas.length; i++) {
			System.out.println("Bebida [" + (i+1) + "] es " + bebidas[i].getMarca().name() + 
					            ". Se sirvio: " + bebidas[i].seSirvio() );
		}		
		System.out.println("-------------------------------------------------------------------");
	} // Fin de main
	
} // Fin de la clase TestBebidasDeCerveza
