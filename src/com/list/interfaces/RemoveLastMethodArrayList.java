package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveLastMethodArrayList {

	public static void main(String[] args) {

		// works for all list interfaces.

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("b");
		linkList.add("e");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("aerer");

		// no need to pass anything
		// removes the last element from the list
		String s1 = linkList.removeLast();
		System.out.println(s1);
	}

}
