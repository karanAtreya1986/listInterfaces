package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveAllMethodOnSingleElement {

	// works for all list interfaces.
	public static void main(String[] args) {

		LinkedList<String> obj = new LinkedList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		LinkedList<String> obj1 = new LinkedList<>();

		obj1.add("Aeewrewr");
		obj1.add("B32434");
		obj1.add("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.add("A234234ererer");

		boolean b2 = obj.addAll(obj1);
		System.out.println(b2);

		System.out.println(obj);
		System.out.println(obj1);

		// remove all cannot be applied on single element
		// we require a collection to be passed as parameter
		// gives compile time error
//		boolean b1 = obj.removeAll("a");
//		System.out.println(b1);

		System.out.println(obj);
		System.out.println(obj1);
	}

}
