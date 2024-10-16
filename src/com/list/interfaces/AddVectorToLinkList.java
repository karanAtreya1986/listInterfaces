package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class AddVectorToLinkList {

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

		// you have to pass vector when defining array list
		// this will add vectors into array list
		// elements will be added at the start of the array list
		// linkList.add elements will be added later after vector elements
		LinkedList<String> linkList = new LinkedList<>(v1);
		linkList.add("a12234");
		linkList.add("a234324");
		linkList.add("@#$#@4a");
		linkList.add("@#$@#42a");

		System.out.println(linkList);
		System.out.println(v1);

		// Enumeration cannot be used with any other list interface.
		// dont see the option with array list or link list

//		v1.elements();
//		arrayList.elements();

		// Best part is collectionNames prints the values without any additional method.
		// In objects,
		// it will print memory reference.
		// print the collection name directly.
	}

}
