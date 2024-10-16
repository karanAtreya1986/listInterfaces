package com.list.interfaces;

import java.util.Iterator;
import java.util.Vector;

public class VectorTraversalExampleTwo {
	
	// works for arraylist, linklist, vector and stacks.

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(10, 5);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("lion");
		v1.addElement("cheetah");
		v1.addElement("rabbit");
		v1.add("laran");

		// normal for each also works for vector traversal
//		for (String string : v1) {
//			System.out.println(string);
//		}

		// just printing out the vector name also prints in list format
//		System.out.println(v1);

		// even normal iterator works for printing vector
		Iterator<String> s1 = v1.iterator();
		while (s1.hasNext()) {
			String s2 = s1.next();
			System.out.println(s2);
		}
	}

}
