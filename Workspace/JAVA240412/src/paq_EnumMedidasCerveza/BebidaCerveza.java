package paq_EnumMedidasCerveza;

public class BebidaCerveza {
	
	enum MarcaCerveza { AMBAR, GUINNESS, HEINEKEN } // Tipos enumerados sencillos. Solo tenemos estas marcas
	private Vaso vaso;  // tama–o de la bebida
	private MarcaCerveza marca;  // marca de la bebida
	
	public BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
		
		this.marca = marca;
		this.vaso = vaso;
	}
	
	public Vaso getVaso() {
		
		return vaso;
	}
	
	public MarcaCerveza getMarca() {
		
		return marca;
	}
	
	public void servir() {
		
		System.out.println("Sirviendo " + vaso.name() + " de " + vaso.getCentimetrosCubicos() + "cc. de cerveza " + marca);
	}
	
	public String seSirvio() {
		
		return this.vaso.medida(vaso);
	}
	
} // Fin de la clase BebidaCerveza

