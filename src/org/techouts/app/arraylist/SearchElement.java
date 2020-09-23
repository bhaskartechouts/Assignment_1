package org.techouts.app.arraylist;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		
		System.out.println("Search Techouts@Team : " + arrayList.contains("Techouts@Team") );
		System.out.println("Search Techouts : " + arrayList.contains("Techouts"));
		
	}
}
