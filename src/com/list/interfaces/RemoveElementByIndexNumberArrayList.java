package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementByIndexNumberArrayList {

	public static void main(String[] args) {
		// works for all list interfaces.

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// pass in the index number
		// return type is datatype of the array list
		// returns the element at the index which is removed.
//		String s1 = obj.remove(3);
//		System.out.println(s1);

		// try removing from index which is not present
		// we get index out of bounds exception
		String s2 = obj.remove(33);
		System.out.println(s2);
	}

}
