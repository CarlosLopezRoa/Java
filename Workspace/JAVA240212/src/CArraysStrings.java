
public class CArraysStrings {
	
	 public static void main(String[] args) {
	    	
	    	String beatles[] = { "John", "Paul", "George","Ringo"};
	                
	    	int i = 0;
	        while ( i < beatles.length ) {
	        	System.out.println("beatles [" + i + "] = " + beatles[i].toString());
	        	i++;
	        } // fin while
	        System.out.println("---------------------------------------------");
	        // qué te oarece este for ?
	        i = 0;
	        for (String s:beatles) {
	        	System.out.println("beatles [" + i + "] = " + s.toString());
	            i++;
	        }
	    } // fin de main

}
