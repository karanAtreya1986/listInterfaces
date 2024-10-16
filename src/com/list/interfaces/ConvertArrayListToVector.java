package com.list.interfaces;

import java.util.ArrayList;
import java.util.Vector;

public class ConvertArrayListToVector {

	public static void main(String[] args) {

		// same working for link list and array list

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("a12234");
		arrayList.add("a234324");
		arrayList.add("@#$#@4a");
		arrayList.add("@#$@#42a");

		// pass in the array list when defining vector
		// arraylist will be displayed first then vectors
		// in short what is added in right hand side will be displayed first and then
		// where it is added will be displayed later
		Vector<String> v1 = new Vector<>(arrayList);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("a234324");
		v1.addElement("a12234");
		v1.addElement("rabbit");
		v1.add("laran");

		System.out.println(arrayList);
		System.out.println(v1);

	}

}
