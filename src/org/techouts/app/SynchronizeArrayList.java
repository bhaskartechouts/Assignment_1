package org.techouts.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {

public static void main(String[] args)  {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Skype");
		arrayList.add("Techouts@Office");
		arrayList.add("Techouts@Team");
		
		List list = Collections.synchronizedList(arrayList);
		
		synchronized (list) {  
            Iterator<String> itr =list.iterator();  
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
        }  
		
}
}
