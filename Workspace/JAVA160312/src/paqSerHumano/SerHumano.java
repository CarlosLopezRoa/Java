package paqSerHumano;

public class SerHumano {

	// Datos globales a todo ser humano. No cambian. Son de referencia. Variable de la clase. 
	public final static double TEMPERATURA_NORMAL = 36.5;
	public final static int PRESION_ARTERIAL_SISTOLICA_NORMAL = 120; // máximo de la curva de presión en las arterias. 
	public final static int PRESION_ARTERIAL_DIASTOLICA_NORMAL = 80; // valor mínimo de la curva de presión.
	public final static double HEMOGLOBINA_HOMBRE_NORMAL = 17; // transporta el oxígeno desde los órganos respiratorios 
	                                                        // hasta los tejidos.
	public final static double HEMOGLOBINA_MUJER_NORMAL = 14;
	
	// variables compartidas entre todos los objetos
	public static int numeroDePersonas = 0; 
	public static int numeroDeMenoresEdad = 0;
	public static int numeroDeMayoresDeEdad = 0;
	public static int numeroDeMujeres = 0;
	public static int numeroDeHombres = 0;

	// Datos personales de la persona, son variables de instancia, dependen de cada objeto.
	private String nombre;
	private String nacionalidad;
	private String fechaNacimiento;
	private char sexo;
	private String estado;
	private String ciudad;
	private String nombreDelPadre;
	private String nombreDelaMadre;
	// Datos de su estado de salud de la persona. Son variables de instancia, dependen de cada objeto.
	private double temperatura;
	private int presionSistolica;
	private int presionDiastolica;
	private double estatura;
	private double peso;
	private double nivelHemoglobina;
	
		
	// Constructor de la clase. No se permite constructor vacío en esta clase.
	public SerHumano(String initNombre, String initNacionalidad, 
			         String initFechaNacimiento, char initSexo,
			         String initEstado, String initCiudad,
			         String initNombreDelPadre, String initNombreDelaMadre) {  // Constructor con parámetros
		
		nombre = initNombre;
		nacionalidad = initNacionalidad;
		fechaNacimiento = initFechaNacimiento;
		sexo = initSexo;
		estado = initEstado;
		ciudad = initCiudad;
		nombreDelPadre = initNombreDelPadre;
		nombreDelaMadre = initNombreDelaMadre;
	}
		
	// Métodos set para dar valor a los atributos
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public void setPresionSistolica(int presionSistolica) {
		this.presionSistolica = presionSistolica;
	}
	
	public void setPresionDiastolica(int presionDiastolica) {
		this.presionDiastolica = presionDiastolica;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setNivelHemoglobina(double nivelHemoglobina) {
		this.nivelHemoglobina = nivelHemoglobina;
	}
	
	// Métodos get para obtener el valor de los atributos
	public String getNombre() {
		return nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public char getSexo() {
		return sexo;
	}
	public String getEstado() {
		return estado;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getNombreDelPadre() {
		return nombreDelPadre;
	}
	public String getNombreDelaMadre() {
		return nombreDelaMadre;
	}
	public double getTemperatura() {
		return this.temperatura;
	}
	public int getPresionSistolica() {
		return this.presionSistolica;
	}
	public int getPresionDiastolica() {
		return this.presionDiastolica;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getEstatura() {
		return this.estatura;
	}
	public double getNivelHemoglobina() {
		return this.nivelHemoglobina;
	}
	
	public int getEdad(int añoActual) {
		
		String[] fecha = this.fechaNacimiento.split("/");
		int año = Integer.parseInt(fecha[2]);
		return (añoActual - año );
	}

} // Fin de la clase SerHumano



