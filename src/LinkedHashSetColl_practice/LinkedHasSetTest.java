package LinkedHashSetColl_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>();
		ll.add(23);
		ll.add(38);
		ll.add(56);
		ll.add(99);
		ll.add(84);
		ll.add(null);
		System.out.println("LinkedList Element:"+ll);
		
		// creating LinkedHshSet from ArrayList
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		LinkedHashSet<Integer> ll2=new LinkedHashSet<Integer>(al);
		ll2.add(60);
		ll2.add(70);
		ll2.addAll(ll);
		System.out.println("After conversion:"+ll2);
		
		//Accessing linkedList element
		Iterator<Integer> itr = ll2.iterator();
		while(itr.hasNext())
		{
			Integer value = itr.next();
			System.out.println(value);
		}
		
		//removing element from LinkedList
		ll2.remove(1);
		System.out.println("After Removing:"+ll2);
		ll2.removeAll(ll);
		System.out.println("After removing collection:"+ll2);
		
		//Union peration of set
		
		LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("LinkedHashSet1: " + evenNumbers);
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("LinkedHashSet2: " + numbers);
        
       numbers.addAll(evenNumbers);
       System.out.println("Union of sets is:"+numbers);
       
       //Intersection of set
       LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
       primeNumbers.add(2);
       primeNumbers.add(3);
       System.out.println("LinkedHashSet1: " + primeNumbers);
       primeNumbers.retainAll(evenNumbers);
       System.out.println(primeNumbers);
		
	}

}
