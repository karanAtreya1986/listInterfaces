package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class IndexOfMethodInVectorList {
	
	// works for all list interfaces

	public static void main(String[] args) {

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");
		linkList.addElement("e");

		// pass in the object as parameter to index of
		// it will return int which specifies the index

		// Searching is slow in linked list.

		int i1 = linkList.indexOf(null);
		System.out.println(i1);

	}

}
