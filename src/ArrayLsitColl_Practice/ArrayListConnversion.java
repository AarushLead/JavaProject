package ArrayLsitColl_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConnversion {

	public static void main(String[] args) {
		//Method 1: using Array.asList()
		
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> citylist=new ArrayList<String>(Arrays.asList(citynames));
		
	     /*Adding new elements to the converted List*/
		citylist.add("manali");
		citylist.add("singapore");
		for (int i = 0; i < citylist.size(); i++) 
		{
		System.out.println(citylist.get(i));	
		}
		
		//Method 2:Collection.addAll()[faster than Arrays.asList()]
		 String array[]={"Hi", "Hello", "Howdy", "Bye"};
		 ArrayList<String> arraylist= new ArrayList<String>();
		 Collections.addAll(arraylist, array);
		 for (String string : arraylist) {
			System.out.println(string);
		}
		 

	}

}
