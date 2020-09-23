package org.techouts.app.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsertArrayListUsingListIterator {

	 public static void main(String[] args) {  
	      List<String>  list = new ArrayList<>();  
	      Iterator<String> itr = null;  
	      list.add("Techouts");  
	      list.add("Techouts@"); 
	      list.add("Techouts@Skype");
	      list.add("Techouts@Gmail.com");
	      itr = list.listIterator();     
	      while(itr.hasNext()){  
	          System.out.println(itr.next());  
	      }   
	   }  
}
