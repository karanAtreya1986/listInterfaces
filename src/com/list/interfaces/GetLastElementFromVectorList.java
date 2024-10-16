package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class GetLastElementFromVectorList {

	public static void main(String[] args) {

		// getlast is applicable for all list interfaces

		Vector<String> arraylist = new Vector<>();
		arraylist.add("a");
		arraylist.addElement(null);
		arraylist.add("b");
		arraylist.addElement("c");
		arraylist.add("d");
		arraylist.addElement("e");

		// gets the last element
		// we can then print what it is
		String s1 = arraylist.getLast();
		System.out.println(s1);

	}

}
