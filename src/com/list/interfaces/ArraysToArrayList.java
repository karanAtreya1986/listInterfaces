package com.list.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysToArrayList {

	public static void main(String[] args) {

		/* Array Declaration and initialization */
		String citynames[] = { "A", "B", "C", "D" };

		/* Array to ArrayList conversion */
		// when declaring array list, pass in the arrays in arrays.aslist(arrayname)
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("E");
		citylist.add("F");

		/* Final ArrayList content display using for or iterator */
		for (String str : citylist) {
			System.out.println(str);
		}
	}
}
