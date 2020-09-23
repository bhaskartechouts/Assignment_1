package org.techouts.app;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Techouts");
		map.put(2, "Techouts@Team");
		map.put(3, "Techouts@Skype");
		map.put(4, "Techouts@Gmail");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry  map2 = (Map.Entry) itr.next();
			System.out.println("getKey : "+ map2.getKey() + " "+"getValue : "+map2.getValue());
		}
	}
}
