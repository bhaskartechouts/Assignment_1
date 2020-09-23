package org.techouts.app.arraylist;

import java.util.ArrayList;

public class RemoveSpecifiedIndexElements {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		System.out.println("Before Remove : " + arrayList);
		arrayList.remove(2);
		System.out.println("After Removing : " + arrayList);
		arrayList.remove(1);
		System.out.println("After Removing : " + arrayList);
	}
}
