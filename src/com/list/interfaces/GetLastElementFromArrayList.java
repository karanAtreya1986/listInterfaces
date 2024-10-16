package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GetLastElementFromArrayList {

	public static void main(String[] args) {

		// getlast is applicable for all list interfaces

		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("a");
		arraylist.add(null);
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");

		// gets the last element
		// we can then print what it is
		String s1 = arraylist.getLast();
		System.out.println(s1);

	}

}
