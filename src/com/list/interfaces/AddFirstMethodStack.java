package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AddFirstMethodStack {

	// works for all list interfaces.

	// Duplicates allowed.
	// Insertion and retrieval order maintained.
	// Non synchronized.
	// Manipulation is faster as no shifting needs to be done.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push("a");
		linkList.add("a");
		linkList.push("a");

		linkList.add(null);
		linkList.push(null);
		linkList.add(null);
		linkList.push(null);

		linkList.add("b");
		linkList.push("c");
		linkList.add("d");
		linkList.push("e");

		// add first will add the element to the start of the list
		// specify the element to be added
		// return type is void
		linkList.addFirst("Karan");

		for (String st1 : linkList) {
			System.out.println(st1 + " ");

		}
	}

}
