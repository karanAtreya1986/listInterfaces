package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SetMethodInVectorList {
	
	// same for array list and link list and vector and stack.

	public static void main(String[] args) {

		Vector<String> obj = new Vector<>();

		obj.add("A");
		obj.addElement("B");
		obj.add("C");
		obj.add("C");
		obj.addElement("A");
		obj.add(null);

		Vector<String> obj1 = new Vector<>();

		obj1.add("Aeewrewr");
		obj1.addElement("B32434");
		obj1.add("C#@$@#$34");
		obj1.addElement("@#$@#$C");
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
