package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PollLastMethodStack {

	// poll last method not for vector list.
			// gives compile time error.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push("b");
		linkList.add("c");
		linkList.push("d");

//		// removes the last element by default
//		String s1 = linkList.pollLast();
//		// output will be the first element - d
//		System.out.println(s1);
//		// remainder of link list is printed
//		System.out.println(linkList);

	}

}
