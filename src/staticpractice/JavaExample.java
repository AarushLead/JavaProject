package staticpractice;

public class JavaExample {

	static  int i;
	static String name;
	static
	{
		i=10;
		name="shobhit";
	}
	public static void main(String[] args) {
		System.out.println("value of i is:"+i);
		System.out.println("Name of person is "+name);
}
}
