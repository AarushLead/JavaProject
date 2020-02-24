package instanceOfExample;

public class InstanceOftest {

	public static void main(String[] args) {
	 Dog d1=new Dog();
	 System.out.println("Is d1 the instance of Dog :"+(d1 instanceof Dog));
	 System.out.println("Is d1 the instance of Dog :"+(d1 instanceof Animal));

	}

}
class Animal
{
	
}
class Dog extends Animal
{
	
}
