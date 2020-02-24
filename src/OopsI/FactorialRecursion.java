package OopsI;

public class FactorialRecursion {

	public static void main(String[] args) {
		int fact = factorial(6);
		System.out.println("Factorial of number is :"+fact);
	}

	private static int factorial(int num) {
		if (num != 0) {
			return  num * factorial(num - 1);
		}
		else
		{
			return 1;
		}
		

	}

}
