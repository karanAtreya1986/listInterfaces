package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorArrayList {

	public static void main(String[] args) {

		ArrayList<String> v1 = new ArrayList<>();
		v1.add("tiger");
		v1.add("tiger");
		v1.add(null);
		v1.add(null);
		v1.add("lion");
		v1.add("cheetah");
		v1.add("rabbit");
		v1.add("laran");

		// even normal iterator works for printing arraylist
		Iterator<String> s1 = v1.iterator();
		while (s1.hasNext()) {
			String s2 = s1.next();
			System.out.println(s2);
		}
	}

}
