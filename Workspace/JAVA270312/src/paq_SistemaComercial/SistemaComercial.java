package paq_SistemaComercial;

public class SistemaComercial {
	
	public static void main(String[] args) {
		
		System.out.println("----SISTEMA COMERCIAL ---- \n \n");
		Trabajador t1 = new Trabajador("Javier","01/02/1990");
		Trabajador t2 = new Trabajador("Lucia","10/03/1980");
		Trabajador t3 = new Trabajador("Norma","26/10/1985");
		
		ColeccionTrabajadores trabajadores = new ColeccionTrabajadores();
		
		trabajadores.agregar(t1);
		trabajadores.agregar(t2);
		trabajadores.agregar(t3);
		System.out.println("------------------------");
		System.out.println(trabajadores.obtener("Lucia").toString());
		System.out.println("------------------------1");
		System.out.println(trabajadores.toString());
		
		System.out.println("------------------------2");

		System.out.println("------------------------3");

		System.out.println("------------------------4");


		
		
		


		
		
	}

}
