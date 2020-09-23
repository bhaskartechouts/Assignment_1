package org.techouts.app;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Skype");
		arrayList.add("Techouts@Office");
		arrayList.add("Techouts@Team");
		
		System.out.println("Before Reversing ArrayList : " + arrayList.toString());
		
		Collections.reverse(arrayList);
		
		System.out.println("After Reversing ArrayList : " + arrayList.toString());
	}
}
