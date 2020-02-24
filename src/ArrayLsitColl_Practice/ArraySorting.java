package ArrayLsitColl_Practice;


import java.util.Arrays;


public class ArraySorting {

	
	
	public static void main(String[] args) {
		//Sorting integer array
		int[] no= {23,34,54,67,87,34};
		Arrays.sort(no);
		System.out.println("Sorted int Array:");
		System.out.println(Arrays.toString(no));
		
		//sorting string array
		
		String[] fruit= {"Mango","Guava","Apple"};
		Arrays.sort(fruit);
		System.out.println("Sorted String Array:");
		System.out.println(Arrays.toString(fruit));
		
       
        
	}

}
