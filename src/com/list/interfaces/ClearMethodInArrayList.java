package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ClearMethodInArrayList {

	public static void main(String[] args) {

		// clear method works the same way for all list interfaces
		// Once clear method runs, then all elements inside array list gone and
		// statements below it will be of no use. We will not be having any array
		// elements for using.
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

		// clears the array list
		// return type is void.
		// output will be [].
		obj.clear();
		System.out.println(obj);

	}

}
