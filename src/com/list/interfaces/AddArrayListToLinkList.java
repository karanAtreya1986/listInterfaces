package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddArrayListToLinkList {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		LinkedList<String> obj = new LinkedList<>();

		obj.add("cheetha");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// returns true or false depending on addition
		// adds a1 to b1
		boolean b1 = obj.addAll(a1);
		System.out.println(b1);

		System.out.println("array list ---- " + a1);
		System.out.println("link list ---- " + obj);
	}

}
