
package paqSistemaBancario;


public class TestCCuenta {

  public static void main(String[] args) {
	  
	System.out.println("=== SISTEMA BANCARIO === \n");
    CCuenta cuenta01 = new CCuenta();
    CCuenta cuenta02 = new CCuenta("Karla López Aragón", "Banc-888-123456-987",
                                    3000, 4.0);
    
    // Reportar cuenta01
    System.out.println(cuenta01.getNombre());
    System.out.println(cuenta01.getCuenta());
    System.out.println(cuenta01.getSaldo());
    System.out.println(cuenta01.getTipoDeInteres());
    System.out.println("-----------------------");
    // Ingresar datos a la cuenta01
    cuenta01.setNombre("Salvador Martínez Ortiz");
    cuenta01.setCuenta("Banc-999-999123-456");
    cuenta01.setTipoDeInteres(4.5);
    cuenta01.setSaldo(true, 1000);

    cuenta01.setSaldo(false, 500);  // poner saldo
    cuenta01.sacarDinero(300);   // retirar dinero del saldo
    
    // Impresión de datos
    System.out.println(cuenta01.getNombre());
    System.out.println(cuenta01.getCuenta());
    System.out.println(cuenta01.getSaldo());
    System.out.println(cuenta01.getTipoDeInteres());
    System.out.println("-----------------------");
    System.out.println(cuenta02.getNombre());
    System.out.println(cuenta02.getCuenta());
    System.out.println(cuenta02.getSaldo());
    System.out.println(cuenta02.getTipoDeInteres());
  }
  
} // Fin de la clase TestCCuenta
