package breakStatement;

import java.util.Scanner;

public class BreakExample {
	 public static void main(String args[]){
		 Double num,sum=0.0;
		 Scanner input = new Scanner(System.in);
		 while(true)
		 {   
			 System.out.println("Enter the number:");
			 num=input.nextDouble();
			 if(num<0.0)
			 {
				 break;
			 }
			 sum=sum+num;
			 System.out.println("sum of numbet is :"+sum);
		 }
		 System.out.println("Thanks for your positive  input");
			 
		 }
}
