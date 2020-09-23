package org.techouts.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeArrayList {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Techouts");
		arrayList.add("Techouts@Skype");
		arrayList.add("Techouts@Office");
		arrayList.add("Techouts@Team");
		
		File f = new File("D:/text/Arraylist.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(arrayList);
		oos.close();
		fos.close();
		System.out.println("Serialize ArrayList is Done ");
		
	}
}
