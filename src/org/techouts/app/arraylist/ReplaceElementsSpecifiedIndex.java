package org.techouts.app.arraylist;

import java.util.ArrayList;

public class ReplaceElementsSpecifiedIndex {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		
		System.out.println("Before Replace : " + arrayList);
		
		arrayList.set(2, "Techouts@Team");
		
		System.out.println("After Replace : " + arrayList);
	}
}
