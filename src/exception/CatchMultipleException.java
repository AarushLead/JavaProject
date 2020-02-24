package exception;

public class CatchMultipleException {

	public static void main(String[] args) {
	 int[] a=new int[10];
	 try
	 {
		a[10]=30/0; 
	 }
	 catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println(e.getMessage());
	 }

	}

}
