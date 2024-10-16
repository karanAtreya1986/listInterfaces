package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddTwoLinkListOfDifferentDataType {

	public static void main(String[] args) {

		LinkedList<String> obj = new LinkedList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		LinkedList<Integer> obj1 = new LinkedList<>();

		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		obj1.add(6);

		// different data type collection cannot be added.
		// this applies to all list interfaces.
//		boolean b1 = obj.addAll(obj1);

		// enhanced for loop can be used to iterate list
//		for (String s1 : obj) {
//			System.out.println(s1 + " ");
//		}

		// enhanced for loop can be used to iterate list
//		for (String s2 : obj1) {
//			System.out.println(s2 + " ");
//		}

	}

}
