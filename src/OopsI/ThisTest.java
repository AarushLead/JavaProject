package OopsI;


/**
 * @author Shobhit Sharma
 * @description :This refer to the current object inside the method or constructor 
 * i.e It is reference to current object
 *
 */
public class ThisTest {

	public static void main(String[] args) {
		Thiss t=new Thiss("ProgrammiZ");
		System.out.println("Object reference :"+t);

	}

}
class Thiss
{
	String domain;   //instance variable
	Thiss(String domain)
	{
		this.domain=domain;
		System.out.println("this reference :"+this);
	}
}
