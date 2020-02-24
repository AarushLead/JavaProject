package instanceOfExample;



/**
 * @author Shobhit Sharma
 * @description  If we are doing upcasting in inheritance so we can call only super class method
but to access subclass method we need to perform downcasting
 *
 */
public class InstanceOfExample4 {

	public static void main(String[] args) {
		BiteAnimal bm=new BiteAnimal();
		bm.displayAnimalInfo();
		Tiger t=new Tiger();
		t.displayTigerInfo();
		Cat c=new Cat();
		c.displayCatInfo();
		BiteAnimal bt=new Tiger(); //Ucasting
		bt.displayAnimalInfo();
		BiteAnimal bc=c;          //Upcasting
		bc.displayAnimalInfo();

	}

}
class BiteAnimal
{
	public void displayAnimalInfo()
	{
		System.out.println("Display BiteAnimal Info");
	}
}
class Tiger extends BiteAnimal
{
	public void displayTigerInfo()
	{
		System.out.println("Display Tiger Info");
	}
}
class Cat extends BiteAnimal
{
	public void displayCatInfo()
	{
		System.out.println("Display Cat Info");
	}
}
