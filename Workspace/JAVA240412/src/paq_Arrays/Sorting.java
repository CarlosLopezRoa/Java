package paq_Arrays;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer> ();
		
		l.add(100);
		l.add(1);
		l.add(123);
		
		Object[] lo = l.toArray();
		for (int i = 0; i < lo.length; i++) {
			System.out.println(lo[i]);
		}
		System.out.println("___________________");
		Arrays.sort(lo);
		for (int i = 0; i < lo.length; i++) {
			System.out.println(lo[i]);
		}
		
	}
}
