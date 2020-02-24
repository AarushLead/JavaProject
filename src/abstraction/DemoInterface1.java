package abstraction;

abstract interface IExample1
{
	public abstract void example1();
	void example2();
}
interface IExample2
{
	void example3();
	
	
}
interface IExample3 extends IExample1,IExample2
{
	
}
class ExampleTest implements IExample3
{

	@Override
	public void example1() {
		System.out.println("Interface 1");
		
	}

	@Override
	public void example2() {
		System.out.println("Interface 2");
		
	}

	@Override
	public void example3() {
		System.out.println("Interface 3");
		
	}
	public void demo()
	{
		System.out.println("demo");
	}
	
}
public class DemoInterface1 {

	public static void main(String[] args) {
		
		IExample3 et=new ExampleTest();
		et.example1();
		
		ExampleTest et2=new ExampleTest();
		et2.demo();
		
	}

}
