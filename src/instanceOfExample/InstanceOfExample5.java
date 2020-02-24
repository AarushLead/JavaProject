package instanceOfExample;

public class InstanceOfExample5 {

	public static void main(String[] args) {
		BiteAnimal2 bm=new BiteAnimal2();
		Tiger2 t=new Tiger2();
		t.displayTigerInfo();
		Cat2 c=new Cat2();
		c.displayCatInfo();
		BiteAnimal2 bt1=new Tiger2();
		BiteAnimal2 bt2=new Cat2();//Upcasting
		if(bt1 instanceof Tiger2)
		{
		Tiger2 t2=(Tiger2)bt1;         //Downcasting
		t2.displayTigerInfo();
		}
		if(bt2 instanceof Cat2)
		{		
		Cat2 c2=(Cat2)bt2;            //Downcasting
		c2.displayCatInfo();
		}
		
		
		
		
		

	}

}
class BiteAnimal2
{
	
	/*
	 * public void displayAnimalInfo() {
	 * System.out.println("Display BiteAnimal Info"); }
	 */
	 
}
class Tiger2 extends BiteAnimal2
{
	public void displayTigerInfo()
	{
		System.out.println("Display Tiger2 Info");
	}
}
class Cat2 extends BiteAnimal2
{
	public void displayCatInfo()
	{
		System.out.println("Display Cat2 Info");
	}
}