package paqSistemaBancario;

class CCuenta {
	private String nombre; private String cuenta; private double saldo;
	private double tipoDeInterés;
	public CCuenta() {
	this("?","?",0,0); // el constructor vacío llama al otro constructor para
	} // Constructor vacío inicializar los valores del objeto.
	public CCuenta(String initNombre, String initCuenta, double initSaldo, double initTipo) {
	setNombre(initNombre); setCuenta(initCuenta); setSaldo(true,initSaldo); setTipoDeInteres(initTipo);
	} // Constructor
	public void setNombre(String nombre) {
	if (nombre.length() == 0) {
	System.out.println("Error: el nombre no debe estar vacío."); return;
	}
	this.nombre = nombre; // this hace referencia a la variable 'nombre' de la clase 
	} // Fin de setNombre
	public String getNombre() { return this.nombre;
	} // Fin de getNombre
	public void setCuenta(String cuenta) {
	if (cuenta.length() == 0) { System.out.println("Error: cuenta no válida."); return;
	}
	this.cuenta = cuenta; } // Fin de setCuenta
	public String getCuenta() { return this.cuenta;
	} // Fin de getCuenta
	public void setSaldo(boolean inicializa, double cantidad) {
	if (cantidad < 0) {
	System.out.println("Error: cantidad negativa."); return;
	}
	if ( inicializa ) {
	this.saldo = 0; }
	this.saldo = this.saldo + cantidad; } // Fin de setSaldo
	public double getSaldo() {
	return this.saldo; } // Fin de getSaldo
	public void setTipoDeInteres(double tipo) {
		if (tipo < 0) {
		System.out.println("Error: tipo de interés no válido."); return;
		}
		this.tipoDeInterés = tipo; } // Fin de setTipoDeInteres
		public double getTipoDeInteres() { return this.tipoDeInterés;
		} // Fin de getTipoDeInteres
		public void sacarDinero(double cantidad) {
		if ( this.saldo - cantidad < 0) {
		System.out.println("Error: no dispone de saldo."); return;
		}
		this.saldo = this.saldo - cantidad; } // Fin de sacarDinero
		} // Fin de la clase CCuenta