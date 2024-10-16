package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PollLastMethodArrayList {

	// poll last method not for array list.
	// gives compile time error.

	public static void main(String[] args) {

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");

//		// removes the last element by default
//		String s1 = linkList.pollLast();
//		// output will be the first element - d
//		System.out.println(s1);
//		// remainder of link list is printed
//		System.out.println(linkList);

	}

}
