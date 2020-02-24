package ennumeration;

enum Size {
SMALL,LARGE,MEDIUM,EXTRALARGE
}

public class EnumStringTest {

	public static void main(String[] args) {
	 System.out.println("String value of SMALL pizza is: "+Size.SMALL);
	 System.out.println("String value of SMALL pizza is: "+Size.SMALL.toString());
	 System.out.println("String value of SMALL pizza is: "+Size.SMALL.name());

	}

}
