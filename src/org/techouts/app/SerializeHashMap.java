package org.techouts.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeHashMap {

	public static void main(String[] args) throws Exception {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Techeouts@Gmail.com");
		hashMap.put(2, "Techouts@Team");
		hashMap.put(3, "Techouts@Skype");
	
			File f = new File("D:/text/hashMap.ser");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hashMap);
			oos.close();
			fos.close();
			System.out.println("Serialize HashMap is Done ");
		
	}
}
