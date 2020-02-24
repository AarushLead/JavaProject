package continueStatement;

public class ContinueWhile {
	public static void main(String args[]) {
		int num = 20;
		int i = 1;
		while (i <= num)
		{
			
			if (i == 10)
			{
				i++;
				continue;
			}
			System.out.println("Value of variable is: " + i);
			i++;
		}
		System.out.println("out of while loop");
	}
}
