package ArrayLsitColl_Practice;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("Hi");
	al1.add("How");
	al1.add("You");
	al1.add("Good");
	
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("Hi");
	al2.add("How");
	al2.add("Me");
	al2.add("Good");
	
	for (String str : al1)
	{
		if(al2.contains(str))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	}
}
