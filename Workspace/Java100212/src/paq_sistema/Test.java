package paq_sistema;

public class Test {
	
	public static void main(String[] args){
		
		int 	i1 = 5, i2 = 10;
		double 	r1 = 1.3, r2 = 2.4 ;
		
		
		System.out.println("Sistema se sumas"); //Metodo sobrecargado
		System.out.println("_______________________");
		
		paq_1.Sumar	objeto;			//Type variable
		objeto = new paq_1.Sumar(); //
		
		System.out.println("La suma de i1 + i2 =" + objeto.sumar(i1, i2));
		System.out.println("La suma de i1 + i2 =" + paq_2.Sumar.sumar(r1, r2));
		System.out.println("_______________________");
	}

}//Fin de la clase Test
