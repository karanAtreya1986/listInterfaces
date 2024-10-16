package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddTwoLinkListExampleTwo {

	// same addall method for link list and array list

	public static void main(String[] args) {

		LinkedList<String> obj = new LinkedList<>();

		obj.add("A");
		obj.add(null);
		obj.add(null);
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		LinkedList<String> obj1 = new LinkedList<>(obj);

		obj1.add(null);
		obj1.add("a");
		obj1.add("vince");
		obj1.add("cartoon");
		obj1.add("mac");
		obj1.add("randy");

		System.out.println("first link list -- obj " + obj);
		System.out.println("second link list -- obj1 " + obj1);

	}

}
