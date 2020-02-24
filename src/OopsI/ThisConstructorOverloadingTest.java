package OopsI;

public class ThisConstructorOverloadingTest {

	public static void main(String[] args) {
		ThisConstructorOverloading tco1=new ThisConstructorOverloading("shobhit",29,"SRM");
		ThisConstructorOverloading tco2=new ThisConstructorOverloading("shobhit",29);
		ThisConstructorOverloading tco3=new ThisConstructorOverloading(29);
		System.out.println(tco1+"\n");
		System.out.println(tco2+"\n");
		System.out.println(tco3);
		

	}

}
class ThisConstructorOverloading
{
 String name;
 int ageStudent;
 String college;
 ThisConstructorOverloading(String name,int age)
 {   
	 this(age);
	 this.name=name;
 }
 ThisConstructorOverloading(int age)
 {
	 this.ageStudent=age;
 }
 ThisConstructorOverloading(String name,int age,String college)
 {   
	 this.name=name;
	 this.ageStudent=age;
	 this.college=college;
 }
 @Override
 public String toString()
 {
	 return "Name :"+this.name+"\n"+"Age :"+this.ageStudent+"\n"+"College :"+this.college;
 }
}