package com.list.interfaces;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTraversal {

	// Vector and hash table uses enumeration in addition to normal iterator for
	// traversing.

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

		// we use enumeration for traversing vector
		Enumeration<String> e1 = v1.elements();
		// check if more elements are present
		// then use nextelement to get the element
		// print it
		while (e1.hasMoreElements()) {
			String s1 = e1.nextElement();
			System.out.println(s1);
		}
	}

}
