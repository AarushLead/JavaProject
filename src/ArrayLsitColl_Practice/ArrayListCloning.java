package ArrayLsitColl_Practice;

import java.util.ArrayList;

public class ArrayListCloning {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
      
		 ArrayList<String> al = new ArrayList<String>();

	     //Adding elements to the ArrayList
	     al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");
	     System.out.println("ArrayList: "+al);
	     
	     ArrayList<String> al2 = (ArrayList<String>)al.clone();
	     al.add("hello");
	     al.remove("Apple");
	    
	     System.out.println("Original array:"+al);
	     System.out.println("Shallow copy"+al2);
	}

}
