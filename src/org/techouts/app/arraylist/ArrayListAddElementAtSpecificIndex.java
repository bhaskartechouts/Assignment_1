package org.techouts.app.arraylist;

import java.util.ArrayList;

public class ArrayListAddElementAtSpecificIndex {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add(2,"Techouts@");
		arrayList.add(0, "Techouts@Skype");
		for(String str : arrayList) {
			System.out.println(str);
		}
	}
}
