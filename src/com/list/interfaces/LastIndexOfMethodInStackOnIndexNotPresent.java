package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LastIndexOfMethodInStackOnIndexNotPresent {
	
	// works on all list interfaces.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push(null);
		linkList.add("d");
		linkList.push("d");
		linkList.add("d");
		linkList.push("d");
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");
		linkList.push("e");

		// pass in the object
		// pass the element and we get int which denotes the index
		// we pass an element which is not present only
		int i1 = linkList.lastIndexOf("disco");
		// returns -1 as the element is not present
		System.out.println(i1);

	}

}
