package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class AuthorTest {

	public static void main(String[] args) {
		 ArrayList<AuthorComparator> al=new ArrayList<AuthorComparator>();        
	     al.add(new AuthorComparator("Henry", "Tropic of Cancer",  45));
	     al.add(new AuthorComparator("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new AuthorComparator("Frank", "300", 65));
	     al.add(new AuthorComparator("Deborah", "Sky Boys", 51));
	     al.add(new AuthorComparator("George R. R.", "A Song of Ice and Fire", 62));

	     System.out.println("Sorting by Author Last Name:");      
	     Collections.sort(al);        
	     for(AuthorComparator au: al){       
	       System.out.println(au.firstName+", "+au.lastName+", "+
	           au.age);        
	     } 
	     
	     /*Sorting using AuthorAgeComparator*/      
	     System.out.println("Sorting by Author Age:");
	     Collections.sort(al, new AuthorAgeComparator());
	     for(AuthorComparator au: al){       
	    	 System.out.println(au.firstName+", "+au.lastName+", "+
	  	           au.age);   
	     }             
	     /*Sorting using BookNameComparator*/      
	     System.out.println("Sorting by First Name:");      
	     Collections.sort(al, new AuthorNameComparator());      
	     for(AuthorComparator au: al){       
	    	 System.out.println(au.firstName+", "+au.lastName+", "+
	  	           au.age);       
	     }    
	}

}
