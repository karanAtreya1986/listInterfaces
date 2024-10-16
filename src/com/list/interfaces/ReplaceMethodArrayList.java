package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ReplaceMethodArrayList {

	public static void main(String[] args) {

		// works for all list interfaces.

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// pass in the index and the new value
		// return type is the datatype of list
		// when you print it, we get the last element which was removed
		String s1 = obj.set(2, "ranjani");
		System.out.println(s1);
		// can see the array list with the replaced value
		System.out.println(obj);
	}

}
