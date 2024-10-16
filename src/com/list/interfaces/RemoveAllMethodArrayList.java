package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethodArrayList {

	public static void main(String[] args) {

		// works for all list interfaces.

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

		// first add all elements of right list into left list
		// addall requires another collection and returns boolean if successfully added
		// or not
		boolean b2 = obj.addAll(obj1);
		System.out.println(b2);

		// print the list directly in collections
		// we wont get memory address, that is the best part.
		// list after addition
		System.out.println(obj);
		System.out.println(obj1);

		// removeall requires another collection and returns boolean if removed
		// successfully or not
		// removes all elements of right list from left list
		boolean b1 = obj.removeAll(obj1);
		System.out.println(b1);

		// print collection after removal
		System.out.println(obj);
		System.out.println(obj1);
	}

}
