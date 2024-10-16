package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClearMethodInVectorList {

	public static void main(String[] args) {

		// clear method works the same way for all list interfaces

		Vector<String> obj = new Vector<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// clears the vector list
		// return type is void.
		// output will be [].
		obj.clear();
		System.out.println(obj);

	}

}
