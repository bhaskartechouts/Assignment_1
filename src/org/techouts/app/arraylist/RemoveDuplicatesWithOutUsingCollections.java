package org.techouts.app.arraylist;

import java.util.ArrayList;

public class RemoveDuplicatesWithOutUsingCollections {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new  ArrayList<>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		arrayList.add("Techouts");
		arrayList.add("Techouts@Gmail.com");
		arrayList.add("Techouts@");
		arrayList.add("Techouts@Skype");
		System.out.println("Before Remove Duplicates Elements: " + arrayList);
		
		for(int i = 0 ;i < arrayList.size();i++){
			 
			 for(int j = i+1 ;j < arrayList.size();j++){
			            if(arrayList.get(i).equals(arrayList.get(j))){
			                arrayList.remove(j);
			                j--;
			            }
			    }
			 
			 }
			 
			    System.out.println("After Removing Duplicate Elements:"+arrayList);
			 
			}
	
}
