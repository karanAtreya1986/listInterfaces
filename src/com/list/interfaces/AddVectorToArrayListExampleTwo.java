package com.list.interfaces;

import java.util.ArrayList;
import java.util.Vector;

public class AddVectorToArrayListExampleTwo {

	// same working for link list and array list

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(10, 5);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("a234324");
		v1.addElement("a12234");
		v1.addElement("rabbit");
		v1.add("laran");

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("tiger");
		arrayList.add(null);
		arrayList.add("@#$#@4a");
		arrayList.add("@#$@#42a");

		// returns true or false depending on addition result
		// another way to add vector to array list
		// adds right list into left
		// prints left list first then displays the right list
		boolean b1 = arrayList.addAll(v1);
		System.out.println(b1);

		System.out.println(arrayList);
		System.out.println(v1);

	}

}
