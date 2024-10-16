package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class IndexOfMethodInVectorListForIndexNotPresent {
	
	// works for all list interfaces.

	public static void main(String[] args) {

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add(null);
		linkList.addElement("b");
		linkList.add("c");
		linkList.addElement("d");
		linkList.add("e");

		// pass in the object as parameter to index of
		// it will return int which specifies the index

		// Searching is slow in linked list.

		// search for index of element which does not exist
		// output will be -1 as its not present
		int i1 = linkList.indexOf("tiger");
		System.out.println(i1);

	}

}
