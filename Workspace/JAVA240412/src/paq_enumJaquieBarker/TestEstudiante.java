package paq_enumJaquieBarker;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Hugo Lora",1001,EnumEspecialidad.BIOLOGIA);
		Estudiante e2 = new Estudiante("Teresa Serna",1002,EnumEspecialidad.CIENCIAS_COMPUTACIONALES);
		Estudiante e3 = new Estudiante("Andrea Galv‡n",1003,EnumEspecialidad.BIOLOGIA);
		TestEstudiante.imprime(e1);
		TestEstudiante.imprime(e2);
		TestEstudiante.imprime(e3);
		
	} // Fin de main
	
	public static void imprime(Estudiante e) {
		
		System.out.println(e.toString());
		System.out.println("Nombre: " + e.getNombre());
		System.out.println("Expediente: " + e.getExpediente());
		System.out.println("Especialidad: " + e.getEspecialidad());
	} // Fin imprime
	
} // Fin de la clase TestEstudiante
