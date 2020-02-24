package abstraction;


class Example1
{
	void display()
	{
		System.out.println("Display example 1");
	}
}
abstract class Example2 extends Example1
{   
	int c=30;
	public int a=10;
	public static int b=20;
	protected final String NAME="beginners";
	protected static final String CLASS="ANIMAL";
	public abstract void display2();
	protected abstract void display7();
    abstract void display8();
	public void display5()
	{
		System.out.println("Display Example 5");
	}
}
abstract class Example3 extends Example2
{
	public void abstractDisplay3()
	{
		System.out.println("dispaly abstract exmample3");
	}
}
class Example4 extends Example3
{

	public void display2()
	{
		System.out.println("Display Example2 :"+NAME);
	}

	@Override
	protected void display7() {
		System.out.println("Display Example7");
		
	}

	@Override
	void display8() {
		System.out.println("Display Example8");
		
	}
	
}
public class DemoDiff1 {

	public static void main(String[] args) {
	
		Example4 ex=new Example4();
		ex.display2();
		
	}

}
