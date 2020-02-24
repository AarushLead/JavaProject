package ArrayLsitColl_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraySynchronization {

	public static void main(String[] args) {
		
		//Using Collections.synchronizedList() method
		List<String> asl=Collections.synchronizedList(new ArrayList<String>());
		 asl.add("chankit");
		 asl.add("java");
		 asl.add("PhP");
		 
		 System.out.println("Iterating synchronized ArrayList:");
		 synchronized(asl)
		 {
			 Iterator<String> iterator = asl.iterator();
			 while(iterator.hasNext())
			 {
				 String value=iterator.next();
			     System.out.println(value);
			 }
		 }
		 
		 //Using thread-safe variant of ArrayList: CopyOnWriteArrayList
		 CopyOnWriteArrayList<String> a1=new CopyOnWriteArrayList<String>();
		 a1.add("Pen");
		 a1.add("NoteBook");
		 a1.add("Ink");
		 
		 System.out.println("Displaying synchronized ArrayList Elements:");
		   
		 //Synchronized block is not required in this method
		for (String string : a1) {
			System.out.println(string);
		}

	}

}
