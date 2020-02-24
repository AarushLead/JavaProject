package setCollectionPractice;

import java.util.HashSet;

public class HashSet_ArrayConversion {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Apple");
		set.add("Orange");
		
		String[] array = set.toArray(new String[set.size()]);
		 for (String string : array) {
		System.out.println(string);	
		}
		
		

	}

}
