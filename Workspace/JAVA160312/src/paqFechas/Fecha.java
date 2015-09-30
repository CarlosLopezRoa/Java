package paqFechas;


public class Fecha {

	private int dia = 0;
	private int mes = 0;
	private int anio = 0;
	
	public Fecha(int initDia, int initMes, int initAnio) {
	   dia = initDia;
	   mes = initMes;
	   anio = initAnio;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String toString() {
		return dia + ":" + mes + ":" + anio;
	}
	
} // Fin de la clase Fecha

