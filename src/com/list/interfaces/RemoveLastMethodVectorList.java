package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class RemoveLastMethodVectorList {

	public static void main(String[] args) {

		// works for all list interfaces.

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.add("c");
		linkList.addElement("d");
		linkList.add("b");
		linkList.add("e");
		linkList.add("a");
		linkList.addElement("a");
		linkList.add("a");
		linkList.add("aerer");

		// no need to pass anything
		// removes the last element from the list
		String s1 = linkList.removeLast();
		System.out.println(s1);
	}

}
