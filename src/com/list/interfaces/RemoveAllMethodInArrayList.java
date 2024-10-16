package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethodInArrayList {

	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		List<String> obj1 = new ArrayList<>();

		obj1.add("Aeewrewr");
		obj1.add("B32434");
		obj1.add("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.add("A234234ererer");

		// addall method returns boolean
		// true if added
		// false if not added
		boolean b2 = obj.addAll(obj1);
		System.out.println("check if the addition is successful ---->" + b2);
		System.out.println("elements after adding both list ---->" + obj);
		System.out.println("printing the second array list ---->" + obj1);

		// removeall method needs another collection
		// we added two array list
		// we now remove obj1 from obj
		// removeall returns boolean
		// true if removed
		// false if not removed
		boolean b1 = obj.removeAll(obj1);
//		System.out.println(obj.removeAll(obj1));
		System.out.println("check if removal is successful ---->" + b1);
		System.out.println("print array list one after removal of elements ---->" + obj);
		System.out.println("print the second array list ---->" + obj1);

	}

}
