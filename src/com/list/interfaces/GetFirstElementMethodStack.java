package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GetFirstElementMethodStack {

	public static void main(String[] args) {

		// works for all list interfaces.

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push(null);
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");
		linkList.push("e");

		// get first will return the first element in list
		// when printing it will show the first element
		String s1 = linkList.getFirst();
		System.out.println(s1);

	}

}
