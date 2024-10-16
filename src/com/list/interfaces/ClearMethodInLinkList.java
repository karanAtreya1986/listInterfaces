package com.list.interfaces;

import java.util.LinkedList;

public class ClearMethodInLinkList {

	public static void main(String[] args) {

		// clear method works the same way for all list interfaces
		// Once clear method runs, then all elements inside link list gone and
		// statements below it will be of no use. We will not be having any array
		// elements for using.
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

		// clears the link list
		// return type is void.
		// output will be [].
		obj.clear();
		System.out.println(obj);

	}

}
