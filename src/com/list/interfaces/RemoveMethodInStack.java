package com.list.interfaces;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveMethodInStack {

	// works in all list interfaces.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.push("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.push("b");
		linkList.add("e");
		linkList.add("a");
		linkList.push("a");
		linkList.add("a");
		linkList.add("a");

		// give the index number and you get the element in that location which will be
		// removed
//		String s1 = linkList.remove(5);
//		System.out.println(s1);

		// give index which does not exist
		// we get index out of bounds exception in output
//		String s1 = linkList.remove(30);
//		System.out.println(s1);

		// returns true or false if the element exist
		// we pass in the object
		boolean b1 = linkList.remove("b");
		System.out.println(b1);

		// pass in object which is not present in list
		// this will return false
		boolean b2 = linkList.remove("brwerwerewr");
		System.out.println(b2);
	}

}
