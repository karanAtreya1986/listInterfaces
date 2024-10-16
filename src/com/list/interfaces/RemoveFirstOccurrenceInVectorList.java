package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class RemoveFirstOccurrenceInVectorList {

	public static void main(String[] args) {

		// removeFirstOccurrence not for vector list.
		// compile time error.

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");
		linkList.addElement("b");
		linkList.add("b");
		linkList.add("b");
		linkList.addElement("b");
		linkList.add("e");

		// pass in the object as parameter
		// returns boolean if removed or not
		// if multiple occurrence of same object, only remove the first one
//		boolean b1 = linkList.removeFirstOccurrence("b");
//		System.out.println(b1);
//
//		for (String s1 : linkList) {
//			System.out.println(s1);
//		}

		// returns false
//		// we are passing in object which is not present in link list itself
//		boolean b1 = linkList.removeFirstOccurrence("tiger");
//		System.out.println(b1);

		// prints all elements as is
		for (String s1 : linkList) {
			System.out.println(s1);
		}

	}

}

//Addall, remove, set, clear, retain all is same as array list.
