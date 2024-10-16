package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class AddTwoVectorsExampleTwo {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(10, 5);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("lion");
		v1.addElement("cheetah");
		v1.addElement("rabbit");
		// even add method is present
		v1.add("laran");

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		Vector<String> v2 = new Vector<>(v1);
		v2.addElement("tiger");
		v2.addElement("gold");
		v2.addElement(null);
		v2.addElement("silver");
		v2.addElement("bronze");
		v2.addElement("medal");
		v2.addElement("hero");
		// even add method is present
		v2.add("zero");

		System.out.println("vector 1 " + v1);
		System.out.println("vector 2 " + v2);

	}
}
