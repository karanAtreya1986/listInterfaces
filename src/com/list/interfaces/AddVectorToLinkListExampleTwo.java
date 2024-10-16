package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class AddVectorToLinkListExampleTwo {

	// same working for link list and array list

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(10, 5);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("a234324");
		v1.addElement("a12234");
		v1.addElement("rabbit");
		v1.add("laran");

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a12234");
		linkList.add("a234324");
		linkList.add("@#$#@4a");
		linkList.add("@#$@#42a");

		// another way to add vector
		// returns true or false depending on addition results
		boolean b1 = linkList.addAll(v1);
		System.out.println(b1);

		System.out.println("link list is " + linkList);
		System.out.println("vector list is " + v1);

	}

}
