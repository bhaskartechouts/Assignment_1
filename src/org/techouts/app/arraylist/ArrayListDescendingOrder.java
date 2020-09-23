package org.techouts.app.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDescendingOrder {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		
		System.out.println("Before Sorting Descending Order : " + arrayList);
		
		Comparator comparator = Collections.reverseOrder();
		Collections.sort(arrayList, comparator);
		System.out.println("After Sorting Descending Order : " + arrayList);
		
	}
}
