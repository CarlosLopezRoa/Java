package paqTelevision;

public class Television {

	boolean onOff;
	int canal;
	int intensidad;

	public Television(boolean initOnOff, int initCanal, int initIntensidad) {

		onOff = initOnOff;
		canal = initCanal;
		intensidad = initIntensidad;
		mensajeTV("objeto TV creado: onOff =" + onOff + ", canal =" + canal + 
				  ", intensidad =" + intensidad + ".");
	}
	
	public void encender() {

		onOff = true;
		mensajeTV("objeto TV encendido.");
	}

	public void apagar() {

		onOff = false;		
		mensajeTV("objeto TV apagado.");
		mensajeTV("No signal ..............................................");
	}
	
	public void cambiarCanal(String subirBajar) {

		if (subirBajar.equals("SUBIR"))
			canal++;
		else
			canal--;
		mensajeTV("objeto TV cambia al canal: " + canal);
	}

	public void cambiarCanal(int canal) {
		
		this.canal = canal;
		mensajeTV("objeto TV cambia al canal: " + this.canal);
	}
	public void ajustarVolumen(String subirBajar, int intensidad) {

		if (subirBajar.equals("SUBIR"))
			this.intensidad = this.intensidad + intensidad;
		else
			this.intensidad = this.intensidad - intensidad;
		mensajeTV("objeto TV ajusta volumen a intensidad: " + this.intensidad);
	}		
	
	private void mensajeTV(String msg) {

	    System.out.println(msg);	
	}
	
} // Fin de la clase Television

