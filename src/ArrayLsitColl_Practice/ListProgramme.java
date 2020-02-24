package ArrayLsitColl_Practice;

import java.util.ArrayList;

public class ListProgramme {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	 //adding an element to list
	 list.add(23);
	 list.add(37);
	 list.add(65);
	 list.add(76);
	 list.add(90);
	 list.add(34);
	 System.out.println("list :"+list);
	 
	 //adding an elemnt at specific index
	 list.add(0, 100);
	 list.add(1, 100);
	 System.out.println("ArrayList after add operation:"+list);
	 
	 //removing  element from list on index bases
	 list.remove(1);	 
	 System.out.println("Element after removing from list :"+list);
	 
	 
	 //Updating the element with another value
	 list.set(0, 200);
	 System.out.println("Replacing the value another value:"+list);
	 
	 //find the index of element in list
	 int index=list.indexOf(65);
	 System.out.println("Index of element is :"+index);
	 
	 //to clear all element from list
	 list.clear();
	}

}
