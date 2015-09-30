import java.util.*;

public class CTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=0; i<=5; i++) {		
			l.add(i*2);
	}
		for (Integer i:l) {
			System.out.println(">" + i.toString());
			
		}
		//_----
		for(int i=0; i<=5; i++) {		
			l.set(i,new Integer (i*2));
	}
		for (Integer i:l) {
			System.out.println(">" + i.toString());
			
		}
		
		
	}
}
