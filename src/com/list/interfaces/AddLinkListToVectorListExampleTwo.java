package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class AddLinkListToVectorListExampleTwo {

	public static void main(String[] args) {

		LinkedList<String> a1 = new LinkedList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		// giving capacity and load is not mandatory
		Vector<String> v1 = new Vector<>();
		v1.add("tiger");
		v1.add("stone");
		v1.add(null);
		v1.add("cold");
		v1.add("steve");
		v1.add("austin");

		// returns true or false depending on addition results
		// right hand list added to left side list
		// first elements of left list displayed, then elements of right list displayed
		boolean b1 = v1.addAll(a1);
		System.out.println(b1);

		System.out.println("link list " + a1);
		System.out.println("vector list " + v1);

	}

}
