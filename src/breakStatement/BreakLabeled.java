package breakStatement;

public class BreakLabeled {
	public static void main(String[] args) {
		boolean t = true;
		first: 
		{
			second: 
			{

				third:
				{
					System.out.println("I am in before break statement");
					if (t) 
					{
						break second;
					}
					System.out.println("I am in after break statement");
				}
				System.out.println("I am in Second block");
			}
			System.out.println("I am in Firts statement");
		}

	}
}
