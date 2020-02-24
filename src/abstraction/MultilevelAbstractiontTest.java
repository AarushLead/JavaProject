package abstraction;


/**
 * @author Shobhit Sharma
 * description: Multilevel Abstraction is nothing but the implementing a interface or Abstract 
 *              class methods in different sub classes
 *
 */
public class MultilevelAbstractiontTest {

	public static void main(String[] args) {
		SubD d=new SubD();
		d.testA();
		d.testB();
		d.testC();
		d.testD();
		

	}

}
interface A
{
	void testA();
	void testB();
	void testC();
	void testD();
}
abstract class SubB implements A
{   
	@Override
	public void testA()
	{
		System.out.println("test-a");
	}
}
abstract class SubC extends SubB
{   
	@Override
	public void testB()
	{
		System.out.println("test-b");
	}
}
class SubD extends SubC
{   
	@Override
	public void testC()
	{
		System.out.println("test-c");
	}
	
	@Override
	public void testD() {
		System.out.println("test-d");
		
	}
}
