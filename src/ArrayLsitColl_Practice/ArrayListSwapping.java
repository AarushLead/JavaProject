package ArrayLsitColl_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwapping {

	public static void main(String[] args) {
     ArrayList<String> al=new ArrayList<String>();
     al.add("Sachin");
     al.add("Rahul");
     al.add("Saurav");
     al.add("Sunil");
     al.add("Kapil");
     al.add("Vinod");
     
     System.out.println("ArrayList before Swap:");
     for(String temp: al){
         System.out.println(temp);
     }

     System.out.println("ArrayList After Swap:");
    Collections.swap(al, 1, 4);
    for(String temp: al){
        System.out.println(temp);
    }
	}

}
