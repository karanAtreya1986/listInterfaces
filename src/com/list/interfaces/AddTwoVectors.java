package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class AddTwoVectors {

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

		Vector<String> v2 = new Vector<>(10, 5);
		v2.addElement("tiger");
		v2.addElement("gold");
		v2.addElement(null);
		v2.addElement("silver");
		v2.addElement("bronze");
		v2.addElement("medal");
		v2.addElement("hero");
		// even add method is present
		v2.add("zero");

		// we can use addall method
		// returns true or false depending on addition result
		// right list will be added into left list
		// elements from left list printed first, then elements from right list
		boolean b1 = v1.addAll(v2);
		System.out.println(b1);

		System.out.println("vector 1 " + v1);
		System.out.println("vector 2 " + v2);

	}
}
