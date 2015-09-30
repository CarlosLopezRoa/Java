/**
 * Calse para mostrar la manipulación de variables y constantes String.
 * 
 * @author Gerardo Rodríguez Rojano
 * @version 1.0
 */
public class CCadenas {

	
	public static void main(String[] args) {
		
		System.out.println("ACCESO A LAS CARACTERES DE UN STRING.\n");
		String s = "Esta es mi cadena.";
		System.out.println("s = " + s);
		System.out.println("s.charAt(0) = " + s.charAt(0));
		System.out.println("s.charAt(5) = " + s.charAt(5));
		System.out.println("Número de caracteres de 's' = " + s.length());
		System.out.println("s.length()-1 = " + (s.length()-1) );
		
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			System.out.println(i + " -> " + c);
		}
		System.out.println("----------------------------------------------- Prueba1");
		
		System.out.println("COMPARACIÓN Arreglo de char y UN STRING.\n");
		System.out.println( "Un String es un arreglo de caracteres. Ejemplo:");
		char arrayC[] = {'H','o','l','a'};
		System.out.println("arrayC.length = " + "{'H','o','l','a'} length= " + arrayC.length);
		
		String s2 = "Hola";
		System.out.println("s2 = " + s2 + "  s2.length() = " + s2.length());
		
		// Comparar s2 y arrayC
		String resultado = "Iguales.";
		if (arrayC.length != s2.length()) {
			resultado = "Diferentes.";
		}
		for (int i = 0; i < arrayC.length; i++) {
			if (arrayC[i] != s2.charAt(i)) {
				resultado = "Diferentes.";
			}
		}
		System.out.println("arrayC y s2 son " + resultado);
		
		System.out.println("----------------------------------------------- Prueba2");
		
		System.out.println("MAYUSCULAS Y MINUSCULAS.\n");
		
		s = "Esto es una cadena de caracteres.";
		System.out.println("s = " + s);
		String sMayus = s.toUpperCase();
		String sMinus = s.toLowerCase();
		
		System.out.println("sMayus = " + sMayus);
		System.out.println("sMinus = " + sMinus);
		
		System.out.println("----------------------------------------------- Prueba3");
		
		System.out.println("POSICIÓN DE UN CARACTER EN UN STRING.\n");
		s = "Esto es una cadena de caracteres";
		System.out.println("s = " + s);
		int pos1 = s.indexOf('o');
		int pos2 = s.lastIndexOf('e');
		int pos3 = s.indexOf('x');
		
		System.out.println("pos1 'o'= " + pos1);
		System.out.println("pos2 'e'= " + pos2);
		System.out.println("pos3 'x'= " + pos3);
		
		System.out.println("----------------------------------------------- Prueba4");
		
		System.out.println("SUBCADENAS.\n");
		
		s = "Esto Es Una Cadena de caracteres";
		
		System.out.println("s = " + s);
		String s1 = s.substring(0,7);
		System.out.println("s.substring(0,7) = " + s1);
		
		String s3 = s.substring(8,11);
		System.out.println("s.substring(8,11) = " + s3);
		
		// toma desde el caracter 8 hasta el final
		String s4 = s.substring(8);
		
		System.out.println("s1 = " + s1);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		
		System.out.println("----------------------------------------------- Prueba5");
		
		System.out.println("PREFIJOS Y SUFIJOS.\n");
		s = "Un buen libro de Java";
		System.out.println("s = " + s);
		boolean b1 = s.startsWith("Un buen");  // true
		boolean b2 = s.startsWith("A");  // false
		boolean b3 = s.endsWith("Java");  // true
		boolean b4 = s.endsWith("Chau");  // false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("----------------------------------------------- Prueba6");
		
		System.out.println("POSICIÓN DE UN SUBSTRING DENTRO DE UNA CADENA.\n");
		s = "Un buen libro de Java, un buen material.";
		
		int posicion1 = s.indexOf("buen");    // retorna 3
		int posicion2 = s.lastIndexOf("buen"); // retorna 26
		System.out.println(posicion1);
		System.out.println(posicion2);
			
		System.out.println("----------------------------------------------- Prueba7");
		
		System.out.println("CONCATENAR CADENAS.\n");
		String x = "";
		x = x + "Hola, ";
		x = x + "qué tal?";
		System.out.println(x);
		
		System.out.println("----------------------------------------------- Prueba8");
		
		System.out.println("COMPARCIÓN DE STRING.\n");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Ingresa una palabra1: ");
		String palabra1 = scanner.next();
		System.out.println("Ingresa otra palabra2: ");
		String palabra2 = scanner.next();
		
		System.out.println("palabra1 = " + palabra1);
		System.out.println("palabra2 = " + palabra2);
		
		if ( palabra1.equals(palabra2) ) {
			System.out.println("resultado >> Iguales.");
		} else {
			System.out.println("resultado >> Diferentes.");
		}
		
		System.out.println();
		// Pero cuando utilizamos un String Literal y lo asignamos a dos
		// variables de string, ambas apuntan a la misma dirección.
		palabra1 = "Java SE6";
		palabra2 = "Java SE6";		
		System.out.println("palabra1 = " + palabra1);
		System.out.println("palabra2 = " + palabra2);
		
		if ( palabra1 == palabra2) {
			System.out.println("Apuntan al mismo objeto String.");
		} else {
			System.out.println("NO Apuntan al mismo objeto String.");
		}
		
		System.out.println();
		// pero si creamos dos objetos String (comando new) con el mismo contenido y cada 
		// nuevo String lo asignamos a variables diferentes tenemos:		
		palabra1 = new String("Hola!");
		palabra2 = new String("Hola!");
		System.out.println("palabra1 = " + palabra1);
		System.out.println("palabra2 = " + palabra2);
		
		if ( palabra1 == palabra2) {
			System.out.println("Apuntan al mismo objeto String.");
		} else {
			System.out.println("NO Apuntan al mismo objeto String.");
		}
		if ( palabra1.equals(palabra2) ) {
			System.out.println("resultado >> Iguales.");
		} else {
			System.out.println("resultado >> Diferentes.");
		}
		System.out.println("----------------------------------------------- Prueba9");
		
		System.out.println("LA CLASE STRINGBUFFER.\n");
		
		String x2 = new StringBuffer().append("Hola, ").append("qué novedades?").toString();
		System.out.println("StringBuffer x2 = " + x2);
		
		StringBuffer stringBuf = new StringBuffer();
		stringBuf.append('L');
		stringBuf.append('o');
		stringBuf.append('l');
		stringBuf.append('a');
		System.out.println("stringBuf = " + stringBuf.toString());
		
		stringBuf.append(", buen día!. ");
		System.out.println("stringBuf = " + stringBuf.toString());
		
		String m = "Te llamo luego.";
		stringBuf.append(m);
		System.out.println("stringBuf = " + stringBuf.toString());
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Ingresa una palabra: ");
		StringBuffer buffer = new StringBuffer(scan.next());
		System.out.println("buffer = " + buffer.append("-fin."));
		
		buffer.delete(0, buffer.length());
		System.out.println("Luego de ejecutar el método delete, buffer = " + buffer.toString());
		
		char car;
		for (int i = 65; i < 80; i++) {
			car = (char)i;
			buffer.append(car);			
		}
		System.out.println("buffer = " + buffer.toString());
		System.out.println("----------------------------------------------- Prueba10");
		
		System.out.println("CONVERSIÓN ENTRE NÚMEROS Y CADENAS.\n");
		
		int i = 43;
		
		String sInt = Integer.toString(i);
		sInt = sInt + " es un String.";
		System.out.println("sInt = " + sInt);
		
		int i2 = Integer.parseInt("50");
		System.out.println("i + i2 = " + (i + i2));
		
		double d = 24.2;
		
		String sDouble = Double.toString(d);
		sDouble = sInt + " " + sDouble + " es un Double.";
		System.out.println("sDouble = " + sDouble);
		
		double d1 = Double.parseDouble("125.67");
		d1 = d1 + i2;
		System.out.println("d1 = " + d1);
		System.out.println("----------------------------------------------- Prueba10");
		
		System.out.println("EXPRESIONES REGULARES.\n");
		System.out.println("\nMÉTODO 'split' de la clase STRING. ");
		
		String enunciado = "Juan; Pedro;   Lucas;    Tere";
		System.out.println("enunciado = " + enunciado);
		String[] tokens = enunciado.split(";");
		
		System.out.println("Palabras encontradas: ");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("tokens[" + j + "] = " + tokens[j]);
		}
		
		enunciado = "Juan; Pedro;   Lucas;     Tere";
		System.out.println("\nenunciado = " + enunciado);
		tokens = enunciado.split(";\\s*");
		
		System.out.println("Palabras encontradas: ");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("tokens[" + j + "] = " + tokens[j]);
		}
		
		enunciado = "1,2, 3,   4,        5,6";
		System.out.println("\nenunciado = " + enunciado);		
		tokens = enunciado.split(",\\s*"); // eliminar espacios en blanco.
		
		System.out.println("Tokens encontrados: ");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("tokens[" + j + "] = " + tokens[j]);
		}		
		
		enunciado = "1, 2, 3, 4, 5, 6";
		System.out.println("\nenunciado = " + enunciado);		
		tokens = enunciado.split(",");
		
		System.out.println("Tokens encontrados: ");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("tokens[" + j + "] = " + tokens[j]);
		}
		
		enunciado = "a, b, c, d, e";
		System.out.println("\nenunciado = " + enunciado);			
		tokens = enunciado.split("\\s");
		
		System.out.println("Tokens encontrados: ");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("tokens[" + j + "] = " + tokens[j]);
		}
				
		String sCiudades = "#01avila#02madrid#03toledo#04santander";
		System.out.println("sCiudades = " + sCiudades.toString());
		String[] items = sCiudades.split("#0[0-9]"); // "#0 + rango de valores entre 0-9"

		for (String item: items)
		 System.out.println(item);	
		
		System.out.println("----------------------------------------------- Prueba11");
	} // Fin de main
	
} // Fin de la clase CCadenas
