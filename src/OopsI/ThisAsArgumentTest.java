package OopsI;

public class ThisAsArgumentTest {

	public static void main(String[] args) {
		ThisAsArgument taa = new ThisAsArgument(10, 20);
		System.out.println(taa.toString());

	}

}

class ThisAsArgument {

	int a, b;

	ThisAsArgument(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("the value of a before method call :" + a);
		System.out.println("the value of b before method call :" + b);
		ThisAsArgument abc =addTwo(this);
		System.out.println("the value of a after method call :" + abc.a);
		System.out.println("the value of b after method call :" + abc.b);

	}

	ThisAsArgument addTwo(ThisAsArgument th) {
		th.a += 100;
		th.b += 300;
		return this;
	}
}
