package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RetainAllMethodInArrayListWithDuplicateElements {

	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		// works for all list interfaces.

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		List<String> obj1 = new ArrayList<>();

		obj1.add("A");
		obj1.add("B");
		obj1.add("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.add("A234234ererer");

		// returns true or false depending on whether retainall is successful or not.
		boolean b1 = obj.retainAll(obj1);
		System.out.println(b1);
		// removes everything from left side list and retains the right hand side list
		// If both list contains common elements those common elements are retained.
		System.out.println(obj);
		// right hand side is retained
		System.out.println(obj1);

	}

}
