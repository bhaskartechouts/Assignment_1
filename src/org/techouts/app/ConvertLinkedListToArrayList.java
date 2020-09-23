package org.techouts.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Techouts");
		linkedList.add("Techouts@Office");
		linkedList.add("Techouts@Skype");
		linkedList.add("Techouts@WhatsApp");
		System.out.println("Before Converting LisnkedList : "+linkedList);
		List<String> list = new ArrayList<>(linkedList); 
		System.out.println("After Converting LinkedList To ArrayList : ");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
