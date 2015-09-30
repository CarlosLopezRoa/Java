package paqSerHumano;



public class TestSerHumano {

	public static void main(String[] args) {

		SerHumano sh = new SerHumano("Hugo Stevens", "E.U.", "12/02/1990", 'H', "California", "Los Angeles", 
				                     "Luis Hugo Stevens", "Maria Stevens");
		sh.setEstatura(1.68);
		sh.setPeso(65);
		sh.setTemperatura(39.2);
		sh.setNivelHemoglobina(11.5);
		sh.setPresionSistolica(130);
		sh.setPresionDiastolica(80);
		
		System.out.println("RESULTADOS DEL PACIENTE:  " + sh.getNombre() + ".\n");
		System.out.println("Edad : " + sh.getEdad(2012));
		System.out.println("Sexo: " + sh.getSexo() + ", Nacionalidad: " + sh.getNacionalidad());
		System.out.println("Los padres son: " + sh.getNombreDelPadre() + " y " +
				            sh.getNombreDelaMadre());
		System.out.println("Ciudad: " + sh.getCiudad() + ", estado: " + sh.getEstado());
		System.out.println("Estatura: " + sh.getEstatura() + ", peso: " + sh.getPeso());
		System.out.println("------------------------------------------------------");
		System.out.println("Datos clínicos.");		
		System.out.println("Temperatura: " + sh.getTemperatura());
		System.out.println("Presion Sistolica: " + sh.getPresionSistolica());
		System.out.println("Presion Diastolica: " + sh.getPresionDiastolica());
		System.out.println("Nivel de Hemoglobina: " + sh.getNivelHemoglobina());
		System.out.println("------------------------------------------------------");
		System.out.println("Análisis de resultados.");
		System.out.println("Temperatura : " + valorarTempertura(sh));
		System.out.println("Presion : " + valorarPresion(sh) );
		System.out.println("Nivel de Hemoglobina: " + valorarHemoglobina(sh));
		System.out.println("Fin de valoracion.   ---------------------------------");
	} // Fin de main
	
	private static String valorarTempertura(SerHumano persona) {
		
		String valoracion = "";
		if (persona.getTemperatura() > SerHumano.TEMPERATURA_NORMAL)
			valoracion = valoracion + "Alta";
		else if ( (SerHumano.TEMPERATURA_NORMAL - persona.getTemperatura()) > 7  ) {
			valoracion = valoracion + "Baja";			
		} else
			valoracion = valoracion + "Correcta";
		return valoracion;
	}
	
	private static String valorarPresion(SerHumano persona) {
	
		String valoracion = "";
		if (persona.getPresionSistolica() > SerHumano.PRESION_ARTERIAL_SISTOLICA_NORMAL)
			valoracion = valoracion + "Presion Sistolica Alta";
		if (persona.getPresionDiastolica() > SerHumano.PRESION_ARTERIAL_DIASTOLICA_NORMAL)
			valoracion = valoracion + "- Presion Diastolica Alta";
		return valoracion;
	}
	
	private static String valorarHemoglobina(SerHumano persona) {
		
		String valoracion = "";
		if (persona.getSexo() == 'H') {
			if (persona.getNivelHemoglobina() > SerHumano.HEMOGLOBINA_HOMBRE_NORMAL)
				valoracion = valoracion + "Alta";
			else if ( (SerHumano.HEMOGLOBINA_HOMBRE_NORMAL - persona.getNivelHemoglobina()) > 5  ) {
				valoracion = valoracion + "Baja";			
			} else
				valoracion = valoracion + "Correcta";
		} else {
			if (persona.getNivelHemoglobina() > SerHumano.HEMOGLOBINA_MUJER_NORMAL)
				valoracion = valoracion + "Alta";
			else if ( (SerHumano.HEMOGLOBINA_MUJER_NORMAL - persona.getNivelHemoglobina()) > 2  ) {
				valoracion = valoracion + "Baja";			
			} else
				valoracion = valoracion + "Correcta";			
		}		
		return valoracion;
	}
	
} // Fin de la clase TestSerHumano



