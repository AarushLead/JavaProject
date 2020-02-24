package wideningMEthodoverloading;

public class TypeCastingMethodOverloading {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int a=10;
		int b=20;
		c.add(a, b);

	}

}
 class Calculator
 {
	 public void add(byte a,byte b)
	 {
		 System.out.println("sum of two byte is "+a+b);
	 }
	 public void add(int a,float b)
	 {
		 System.out.println("sum of two float is "+(a+b));
	 }
 }
