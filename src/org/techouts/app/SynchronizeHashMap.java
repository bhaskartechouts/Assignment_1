package org.techouts.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizeHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Techeouts@Gmail.com");
		hashMap.put(2, "Techouts@Team");
		hashMap.put(3, "Techouts@Skype");
		
		Map map = Collections.synchronizedMap(hashMap);
		Set set = map.entrySet();
		
		 synchronized(map){
		        Iterator iterator = set.iterator();
		        while(iterator.hasNext()) {
		            Map.Entry entry = (Map.Entry)iterator.next();
		            System.out.print(entry.getKey() + " : ");
		            System.out.println(entry.getValue());
		        }
		    }
	}
}
