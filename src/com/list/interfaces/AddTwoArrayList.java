package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddTwoArrayList {

	// same addall method for link list and array list

	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		List<String> obj1 = new ArrayList<>();

		obj1.add("tiger");
		obj1.add("ali");
		obj1.add("vince");
		obj1.add("cartoon");
		obj1.add("mac");
		obj1.add("randy");

		// returns true or false if addition is success or not
		boolean b1 = obj.addAll(obj1);
		System.out.println(b1);

		// obj1 collection added to obj
		// add all will need another collection as parameter
		System.out.println(obj);
		System.out.println(obj1);

	}

}
