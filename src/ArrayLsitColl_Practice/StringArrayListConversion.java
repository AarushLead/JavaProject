package ArrayLsitColl_Practice;

import java.util.ArrayList;

public class StringArrayListConversion {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");
		
		/*ArrayList to Array Conversion */
		String[] str=new String[arrlist.size()];
		for (int i = 0; i < arrlist.size(); i++) {
			str[i]=arrlist.get(i);
		}
		
		//Displaying Array elements*/
		for(String k: str)
		{
			System.out.println(k);
		}
		
		//Method2: Conversion using toArray() method
		
		ArrayList<String> friendsnames= new ArrayList<String>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");
		
		String[] arrl = friendsnames.toArray(new String[friendsnames.size()]);
		/*Displaying Array elements*/
		for(String k: arrl)
		{
			System.out.println(k);
		}
	}

}
