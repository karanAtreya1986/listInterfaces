package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveAllMethodStack {

	public static void main(String[] args) {

		// works for all list interfaces.

		Stack<String> obj = new Stack<>();

		obj.add("A");
		obj.push("B");
		obj.add("C");
		obj.push("C");
		obj.push("A");
		obj.add(null);

		Stack<String> obj1 = new Stack<>();

		obj1.add("Aeewrewr");
		obj1.add("B32434");
		obj1.push("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.push("A234234ererer");

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
