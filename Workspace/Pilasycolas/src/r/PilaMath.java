package r;

//Librerias
import java.util.Scanner;
import java.util.Stack;

// Clase PilaMath
public class PilaMath {
	
	// Main
	public static void main(String[] args)
	{
		// Generamos las pilas empleadas.
		Stack<String> pilamath= new Stack<String>();
		Stack<String> buffop= new Stack<String>();
		Stack<String> buffnum= new Stack<String>();
		
		// Generamos el scanner para obtener de consola.
		Scanner sc=new Scanner(System.in);
		
		// Separamos las entradas mediante espacio.
		String[] ex=sc.nextLine().split(" ");
		
		// Almacenamos en la pila.
		for(int i=0;i<ex.length;i++)
			pilamath.add(ex[i]);
		
		// Mediante un condicional seleccionamos si es un operador o un nœmero.
		for(;!pilamath.empty();)
		{
			
			if(pilamath.peek().equals("+") || pilamath.peek().equals("-") || pilamath.peek().equals("*") || pilamath.peek().equals("/"))
				buffop.add(pilamath.pop());
			else
				buffnum.add(pilamath.pop());
		}
		
		pilamath=null; // Indicar al GarbageCollector que se dej— de usar.
		
		// Empleando la pila de operadores tomamos los dos primeros nœmeros de la pila numŽrica y realizamos la operaci—n guardando en el œltimo elemento de la pila..
		for (;!buffop.empty();)
		{
			if(buffop.peek().equals("+"))
			{
				buffnum.add(Integer.toString(Integer.parseInt(buffnum.pop()) + Integer.parseInt(buffnum.pop())));
				buffop.pop();
				continue;
			}
			
			if(buffop.peek().equals("-"))
			{
				buffnum.add(Integer.toString(Integer.parseInt(buffnum.pop()) - Integer.parseInt(buffnum.pop())));
				buffop.pop();
				continue;
			}
			
			if(buffop.peek().equals("*"))
			{	
				buffnum.add(Integer.toString(Integer.parseInt(buffnum.pop()) * Integer.parseInt(buffnum.pop())));
				buffop.pop();
				continue;
			}
			
			if(buffop.peek().equals("/"))
			{
				buffnum.add(Integer.toString(Integer.parseInt(buffnum.pop()) / Integer.parseInt(buffnum.pop())));
				buffop.pop();
				continue;
			}
		}
		
		// Impresi—n de la operaci—n.
		System.out.print("\n");
		for(String a:buffnum)
			System.out.print(a);
		
	} // Fin del Main
	
} // Fin de la clase PilaMath

