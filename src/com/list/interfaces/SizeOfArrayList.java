package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SizeOfArrayList {

	// same for link list and array list and vector list and stack.
	
	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		List<String> obj1 = new ArrayList<>();

		obj1.add("Awerewr");
		obj1.add("324324B");
		obj1.add("C#$#@$@$");
		obj1.add("Cwerwerwer");
		obj1.add("A2423423");
		obj1.add(null);

		// returns integer number denoting the size
		int i1 = obj1.size();
		// output will be 6
		System.out.println(i1);
	}

}
