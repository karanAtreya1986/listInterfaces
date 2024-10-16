package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PollMethodArrayList {
	// poll method not for array list.
	// gives compile time error.

	public static void main(String[] args) {

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");

		// gives the first element from link list.
		// removes the first element also.
//		String s1 = linkList.poll();
//		System.out.println(s1);
//		System.out.println(linkList);

	}

}
