package paqMat;

public class Operaciones {

	public int sumar(int[] lista ){
		
		int acumulador = 0;

		for (int i = 0; lista[i] != -1; i++) {
			acumulador += lista[i];
		}
		
		return acumulador;
	}
	
	public void imprimeDatos(int [] lista){
		
		for (int x:lista) {
			if (x != -1)
			System.out.println(x);
			else
				break;
			
		}
		
	}
	
	public double promedio (int[] lista){
		
		int i = 0;
		
		for (; lista[i] != -1; i++);
		
		int suma = sumar(lista);
		if (i == 0)
			return 0;
		
		return suma/ i;
	}

} //Fin de la clase
