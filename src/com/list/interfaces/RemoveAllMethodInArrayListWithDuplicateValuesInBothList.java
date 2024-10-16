package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllMethodInArrayListWithDuplicateValuesInBothList {

	public static void main(String[] args) {

		// works for all list interfaces.

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("benagal");
		a1.add("lion");

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("tiger");
		a2.add("girafe");
		a2.add(null);
		a2.add("bulldog");
		a2.add("benagal");
		a2.add("cheetah");

		// returns true or false if the removal is successful or not
		// if a2 contains common elements which are in a1, the a2 list and common
		// elements will be removed
		boolean b1 = a1.removeAll(a2);
		System.out.println(b1);

		// common elements will be removed from both the lists
		System.out.println(a1);
		System.out.println(a2);

		// no change in output with iterator
		// just list output gets changed with normal output
		Iterator<String> i1 = a1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		Iterator<String> i2 = a2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
