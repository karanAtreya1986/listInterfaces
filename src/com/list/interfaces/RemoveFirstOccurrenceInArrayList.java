package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveFirstOccurrenceInArrayList {

	public static void main(String[] args) {

		// The method removeFirstOccurrence(String) is undefined for the type
		// ArrayList<String>
		// not for array list.
		// compile time error.

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("b");
		linkList.add("b");
		linkList.add("b");
		linkList.add("b");
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
		// we are passing in object which is not present in link list itself
//		boolean b1 = linkList.removeFirstOccurrence("tiger");
//		System.out.println(b1);

		// prints all elements as is
		for (String s1 : linkList) {
			System.out.println(s1);
		}

	}

}

//Addall, remove, set, clear, retain all is same as array list.
