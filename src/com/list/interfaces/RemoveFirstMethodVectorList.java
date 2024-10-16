package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class RemoveFirstMethodVectorList {

	public static void main(String[] args) {

		// works for all list interfaces.

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.addElement("b");
		linkList.add("e");
		linkList.add("a");
		linkList.addElement("a");
		linkList.add("a");
		linkList.addElement("a");

		// no need to pass anything
		// removes the first element and returns it
		String s1 = linkList.removeFirst();
		System.out.println(s1);
	}

}
