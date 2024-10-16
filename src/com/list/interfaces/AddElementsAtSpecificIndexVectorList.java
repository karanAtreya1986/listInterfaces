package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class AddElementsAtSpecificIndexVectorList {

	public static void main(String[] args) {

		// applies to all list interfaces.

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add("a");
		linkList.addElement("a");
		linkList.add("a");
		// you give the index and value to be added there
		linkList.add(2, "Salon");

		System.out.println(linkList);
	}

}
