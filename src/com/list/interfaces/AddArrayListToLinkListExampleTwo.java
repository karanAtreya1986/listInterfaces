package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddArrayListToLinkListExampleTwo {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		LinkedList<String> obj = new LinkedList<>(a1);

		obj.add("cheetha");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		System.out.println("array list ---- " + a1);
		System.out.println("link list ---- " + obj);
	}

}
