package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LastIndexOfMethodInLinkListOnIndexNotPresent {

	// works on all list interfaces.

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("d");
		linkList.add("d");
		linkList.add("d");
		linkList.add("d");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// pass in the object
		// pass the element and we get int which denotes the index
		// we pass an element which is not present only
		int i1 = linkList.lastIndexOf("disco");
		// returns -1 as the element is not present
		System.out.println(i1);

	}

}
