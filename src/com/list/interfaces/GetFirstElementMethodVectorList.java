package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class GetFirstElementMethodVectorList {

	public static void main(String[] args) {

		// works for all list interfaces.

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");
		linkList.addElement("e");

		// get first will return the first element in list
		// when printing it will show the first element
		String s1 = linkList.getFirst();
		System.out.println(s1);

	}

}
