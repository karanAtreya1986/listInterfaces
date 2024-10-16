package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LastIndexOfMethodInStack {

	public static void main(String[] args) {
		
		// returns index of last occurrence of the element
		// works with all list interfaces

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
		int i1 = linkList.lastIndexOf("d");
		// returns 8 which is the last index of "d"
		System.out.println(i1);

	}

}
