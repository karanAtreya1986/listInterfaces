package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IndexOfMethodInLinkList {

	public static void main(String[] args) {

		// works for all list interfaces

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// pass in the object as parameter to index of
		// it will return int which specifies the index

		// Searching is slow in linked list.

		int i1 = linkList.indexOf(null);
		System.out.println(i1);

	}

}
