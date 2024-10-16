package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class SetMethodInArrayList {

	public static void main(String[] args) {
		
		// same for array list and link list and vector and stack.

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
