package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class AddArrayListToVectorListExampleTwo {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		Vector<String> v1 = new Vector<>(2, 5);
		v1.add("tiger");
		v1.add("stone");
		v1.add(null);
		v1.add("cold");
		v1.add("steve");
		v1.add("austin");

		// returns true or false depending on addition success
		// another way to add vectors
		// right list added to left list
		// first left list elements seen then right list elements seen
		boolean b1 = v1.addAll(a1);
		System.out.println(b1);

		System.out.println("array list " + a1);
		System.out.println("vector list " + v1);
	}

}
