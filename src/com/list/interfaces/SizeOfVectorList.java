package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class SizeOfVectorList {

	// same for link list and array list and vector list and stack.
	
	public static void main(String[] args) {

		Vector<String> obj = new Vector<>();

		obj.add("A");
		obj.addElement("B");
		obj.add("C");
		obj.add("C");
		obj.addElement("A");
		obj.add(null);

		Vector<String> obj1 = new Vector<>();

		obj1.addElement("Awerewr");
		obj1.addElement("324324B");
		obj1.add("C#$#@$@$");
		obj1.add("Cwerwerwer");
		obj1.add("A2423423");
		obj1.add(null);

		// returns integer number denoting the size
		int i1 = obj1.size();
		// output will be 6
		System.out.println(i1);
	}

}
