package paqTelevision;

public class TestTelevision {

	public static void main(String[] args) {
		
		System.out.println("SISTEMA DE TELEVISIÓN");
		System.out.println();
		Television tv = new Television(false, 1, 1);
		tv.encender();
		tv.cambiarCanal("SUBIR");
		tv.ajustarVolumen("SUBIR", 2);
		tv.cambiarCanal("SUBIR");
		tv.ajustarVolumen("SUBIR", 4);
		tv.cambiarCanal(15);
		tv.cambiarCanal("BAJAR");
		tv.apagar();
	}
	
} // Fin de la clase TestTelevision