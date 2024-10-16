package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GetFirstElementMethodArrayList {

	public static void main(String[] args) {

		// works for all list interfaces.

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// get first will return the first element in list
		// when printing it will show the first element
		String s1 = linkList.getFirst();
		System.out.println(s1);

	}

}
