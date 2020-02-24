package breakStatement;

public class BreakFor {
	 public static void main(String args[]){
		 int num=100;
		  for (int j = 1; j <=num ; j++)
		  {			  
			 
			  if(j==5)
			  {
				  break;	
			  }
			  System.out.println("the value of var is"+j);
		  }
		  System.out.println("out of for loop");
			
		}
}
