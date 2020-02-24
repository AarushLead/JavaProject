package breakStatement;

public class BreakWhile {
	 public static void main(String args[]){
		 int num=100;
		 int i=0;
		 while(i<=num)
		 {   
			 System.out.println("Value of variable is: "+i);
			 if(i==4)
			 {
				 break;
			 }			
			 i++;
		 }
		 System.out.println("out of while loop");
	 }
}
