package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RetainAllMethodInVectorList {

	public static void main(String[] args) {

		Vector<String> obj = new Vector<>();

		// works for all list interfaces.

		obj.addElement("A");
		obj.add("B");
		obj.add("C");
		obj.addElement("C");
		obj.add("A");
		obj.add(null);

		Vector<String> obj1 = new Vector<>();

		obj1.add("Aeewrewr");
		obj1.add("B32434");
		obj1.addElement("C#@$@#$34");
		obj1.addElement("@#$@#$C");
		obj1.add("A234234ererer");

		// retain all
		// accepts another collection as parameter
		// returns boolean if successful or not
		boolean b1 = obj.retainAll(obj1);
		System.out.println(b1);
		// removes everything from left side list and retains the right hand side list
		System.out.println(obj);
		// right hand side is retained
		System.out.println(obj1);

	}

}
