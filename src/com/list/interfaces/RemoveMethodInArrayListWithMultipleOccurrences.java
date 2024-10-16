package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethodInArrayListWithMultipleOccurrences {
	
	// works in all list interfaces.

	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		/* This is how elements should be added to the array list */

		// remove method works same way in link list also

		// will remove first occurrence if there are many occurrences of same type

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);
		obj.add("B");
		obj.add("C");
		obj.add("C");

		// remove element - pass in the index number from where to remove
		// returns string as all elements in arraylist is string
		// returns element which is removed
//		String s1 = obj.remove(2);
//		System.out.println("removed element from the array list is " + s1);

		// another remove method
		// you pass in the object and it will return boolean if its removed or not
		// true means removed
		// false means not removed
		boolean s2 = obj.remove("A");
		System.out.println("removed element from the array list is " + s2);
		// the best part in collection is you can directly pass in the object name
		// it wont print memory address, it will print the values
		System.out.println("printing directly the collection name " + obj);
		// try removing element which is not present
		// output will be false
		boolean s3 = obj.remove("F");
		System.out.println("removed element from the array list is " + s3);

	}

}
