package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddTwoArrayListExampleTwo {

	// same addall method for link list and array list

	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		List<String> obj1 = new ArrayList<>(obj);

		obj1.add("tiger");
		obj1.add("ali");
		obj1.add("vince");
		obj1.add("cartoon");
		obj1.add("mac");
		obj1.add("randy");

		System.out.println("first array list ---- " + obj);
		System.out.println("second array list ---- " + obj1);

	}

}
