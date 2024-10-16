package com.list.interfaces;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTraversalWithListIterator {

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

		// iterate in forward direction
//		ListIterator<String> lt1 = v1.listIterator();
//		while (lt1.hasNext()) {
//			String s1 = lt1.next();
//			System.out.println(s1);
//		}

		// traverse in backward direction
		// we have to give the size in brackets else the output will be blank
		// because when we are in first element, we cannot go to minus one element
		ListIterator<String> lt1 = v1.listIterator(v1.size());
		while (lt1.hasPrevious()) {
			String s1 = lt1.previous();
			System.out.println(s1);
		}
	}

	// Vector and hash table are synchronized, which means multiple threads can use
	// them without any failures.
	// Vector-
	// Slow compared to other APIs.
	// Why?
	// Synchronised and supports multi-threading.

}
