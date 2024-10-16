package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LastIndexOfMethodInArrayList {

	public static void main(String[] args) {
		
		// returns index of last occurrence of the element
		// works with all list interfaces

		ArrayList<String> linkList = new ArrayList<>();
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
		int i1 = linkList.lastIndexOf("d");
		// returns 8 which is the last index of "d"
		System.out.println(i1);

	}

}
