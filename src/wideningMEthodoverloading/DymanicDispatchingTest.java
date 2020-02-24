package wideningMEthodoverloading;


/**
 * @author Shobhit Sharma
 *  Description: (1)When an overridden method is called by a reference, java determines which version of that method to
 *                  execute based on the type of object it refers to.
 *               (2)So the coupling between the method and the caller happens only during the runtime, 
 *                  this is called dynamic dispatching.
 */
public class DymanicDispatchingTest {

	public static void main(String[] args) {
		SuperHero s=new SuperHero();
		s.protection(new GrandFather_Avenger());//Grandfather method
		s.protection(new Child_Hulk());// child_hulk method
		s.protection(new Child_IronMan());//child_IronMan method
		s.protection(new Child_DrStrange());//child_drStrange

	}

}
class SuperHero
{
	void protection(GrandFather_Avenger hero)
	{
		hero.tool();
	}
}
class GrandFather_Avenger
{
	void tool()
	{
		System.out.println("All tool of Avenger");
	}
}
class Child_Hulk extends GrandFather_Avenger
{
	void tool()
	{
		System.out.println("Size is the tool of Hulk");
	}
}
class Child_IronMan extends GrandFather_Avenger
{
	void tool()
	{
		System.out.println("Speed,fly and power is the tool of ironman");
	}
}
class Child_DrStrange extends GrandFather_Avenger
{
	void tool()
	{
		System.out.println("Time is the tool of drstranger");
	}
}
