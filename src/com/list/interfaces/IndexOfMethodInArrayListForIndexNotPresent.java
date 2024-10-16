package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IndexOfMethodInArrayListForIndexNotPresent {

	// works for all list interfaces.

	public static void main(String[] args) {

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
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
