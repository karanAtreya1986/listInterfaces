package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddFirstMethodArrayList {

	// works for all list interfaces.

	// Duplicates allowed.
	// Insertion and retrieval order maintained.
	// Non synchronized.
	// Manipulation is faster as no shifting needs to be done.

	public static void main(String[] args) {

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");

		linkList.add(null);
		linkList.add(null);
		linkList.add(null);
		linkList.add(null);

		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// add first will add the element to the start of the list
		// specify the element to be added
		// return type is void
		linkList.addFirst("Karan");

		for (String st1 : linkList) {
			System.out.println(st1 + " ");

		}
	}

}
