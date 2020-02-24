package OopsI;


/**
 * @author Shobhit Sharma
 *  @description  default constructor is private because we are creating the object inside the class only
 *  if object is created outside the class then we have to make the constructor public 
 */
public class DefaultContructor2 {
	int a;
	int b;
	boolean flag;

	private DefaultContructor2() {
		a = 0;
		b = 0;
		flag = false; 
	}

	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println();
		System.out.println("a = " + dc.a);
		System.out.println("b = " + dc.b);
		System.out.println("flag = " + dc.flag);
	}

}
