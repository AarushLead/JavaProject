package conversion;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceToStringf {

	public static void main(String[] args) {
		 int i=10;
		 int c=i/0;
		 try
		 {
		 System.out.println("Result is :"+c);
		 }
		 catch(ArithmeticException e)
		 {
			 getstacktrace(e);
		 }

	}

	private static void getstacktrace(Exception e) {
		 StringWriter sw = new StringWriter();
         PrintWriter pw = new PrintWriter(sw);
         e.printStackTrace(pw);
         String stacktraceString = sw.toString();
         System.out.println("String is: "+stacktraceString);
	}

}
