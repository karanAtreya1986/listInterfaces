package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetMethodInStack {
	
	// same for array list and link list and vector and stack.

	public static void main(String[] args) {

		Stack<String> obj = new Stack<>();

		obj.push("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.push("A");
		obj.add(null);

		Stack<String> obj1 = new Stack<>();

		obj1.add("Aeewrewr");
		obj1.push("B32434");
		obj1.push("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.add("A234234ererer");

		// set method
		// sets the value
		// give the index and the value
		String s1 = obj.set(2, "Tiger babu");
		// printing the string will return the earlier value which will be replaced
		System.out.println(s1);
		// print the collection object
		System.out.println(obj);

	}

}
