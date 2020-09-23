package org.techouts.app.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayListusingJavaListIterator {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Skype");
		arrayList.add("Techouts@Office");
		arrayList.add("Techouts@Team");
		
		System.out.println("Before Using Iterator : " + arrayList);
		System.out.println();
		System.out.println("After Using Iterator : ");
		System.out.println();
		Iterator iterator = arrayList.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println("After Using ListIterator : ");
		System.out.println();
		ListIterator listIterator = arrayList.listIterator(1);
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
