package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertLinkListToVector {

	public static void main(String[] args) {

		// same working for link list and array list

		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("a12234");
		linklist.add("a234324");
		linklist.add("@#$#@4a");
		linklist.add("@#$@#42a");

		// pass in the array list when defining vector
		// arraylist will be displayed first then vectors
		// in short what is added in right hand side will be displayed first and then
		// where it is added will be displayed later
		Vector<String> v1 = new Vector<>(linklist);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("a234324");
		v1.addElement("a12234");
		v1.addElement("rabbit");
		v1.add("laran");

		System.out.println(linklist);
		System.out.println(v1);

	}

}
