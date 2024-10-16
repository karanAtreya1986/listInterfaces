package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PollMethodVectorList {

	// poll method not for array list.
	// gives compile time error.

	public static void main(String[] args) {

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");

		// gives the first element from link list.
//		// removes the first element also.
//		String s1 = linkList.poll();
//		System.out.println(s1);
//		System.out.println(linkList);

	}

}
