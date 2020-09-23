package org.techouts.app.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		
		System.out.println("Before Sorting Order : " + arrayList);
		
		Collections.sort(arrayList);
		System.out.println("After Sorting Order : " + arrayList);
	}
}
