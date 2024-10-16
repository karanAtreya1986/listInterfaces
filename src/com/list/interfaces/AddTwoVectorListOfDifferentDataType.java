package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class AddTwoVectorListOfDifferentDataType {

	public static void main(String[] args) {

		Vector<String> obj = new Vector<>();

		obj.addElement("A");
		obj.addElement("B");
		obj.addElement("C");
		obj.addElement("C");
		obj.addElement("A");
		obj.addElement(null);

		Vector<Integer> obj1 = new Vector<>();

		obj1.addElement(1);
		obj1.addElement(2);
		obj1.addElement(3);
		obj1.addElement(4);
		obj1.addElement(5);
		obj1.addElement(6);

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
