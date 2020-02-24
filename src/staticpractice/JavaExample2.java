package staticpractice;

public class JavaExample2 {

	
	static  int i;
	static String name;
	static
	{   
		i=10;
		name="shobhit";
		System.out.println("static block 1");
		System.out.println("value of i is:"+i);
		System.out.println("Name of person is "+name);
		
	}
	static
	{   
		i=20;
		name="rishabh";
		System.out.println("static block 2");
		System.out.println("value of i is:"+i);
		System.out.println("Name of person is "+name);
	}
	static 
	{   
		i=30;
		name="franlin";
		System.out.println("static block 3");
		System.out.println("value of i is:"+i);
		System.out.println("Name of person is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
