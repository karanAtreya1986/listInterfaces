package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkListAndViceVersa {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("royal");
		a1.add("bengal");
		a1.add("delhi");

		LinkedList<String> a2 = new LinkedList<>();
		a2.add("lion");
		a2.add("tiger");
		a2.add(null);
		a2.add(null);
		a2.add("royal");
		a2.add("mumbai");
		a2.add("poland");

		// array list to link list or vice versa
		// returns true of false if added successfully or not
		// adds a2 into a1
		boolean b1 = a1.addAll(a2);
		System.out.println(b1);

		System.out.println(a1);
		System.out.println(a2);
	}

}
