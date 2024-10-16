package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnumerationOnlyForVectorAndNotOthers {

	public static void main(String[] args) {

		List<String> arraylist = new ArrayList<>();
		arraylist.add("a");
		arraylist.add("a");
		arraylist.add("a");
		arraylist.add("a");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");

		// Enumeration is not present for any other list interface except vector and stack.
		// same applies for list interface also.
//		arraylist.elements();

	}

}
