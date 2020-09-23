package org.techouts.app;

import java.util.HashSet;

public class ConvertHashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Techouts");
		hashSet.add("Techouts@Office");
		hashSet.add("Techouts@Skype");
		hashSet.add("Techouts@Group");
		
		System.out.println("Before Converting HashSet : "+hashSet);
		String[] arrString = new String[hashSet.size()];
		hashSet.toArray(arrString);
		System.out.println("After Converting HashSet To Array : ");
		for(String str : arrString) {
			System.out.println(str+" ");
		}
	}
}
