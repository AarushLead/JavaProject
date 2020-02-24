package MethodOverriding;

public class SuperCallingExample {

	public static void main(String[] args) {
		Insect i=new Insect();
		i.fly();
		i.bite();
		Insect i1=new cockroach("low");
		i1.bite();
		Insect i2=new Mosquito();
		i2.bite();

	}

}
class Insect
{   
	String poison;
	Insect(String poison)
	{   
		this.poison=poison;
		System.out.println("I am insect");
	}
	Insect()
	{
		
	}
	
	 void fly()
	{
		System.out.println("Insect can fly");
	}
	//overridden method
	protected void bite()
	{
		 System.out.println("Insect used to bite");
	}
}
class cockroach extends Insect
{   
	String poison="medium";
	cockroach(String poison)
	{   
		super(poison);  //calling super class parameterized constructor
		System.out.println("cockroach class");
	}
	//overriding method
	@Override
	protected void bite()
	{   
		super.bite();  // calling method of super class
		System.out.println("I am cockroach have "+poison+" poison than "+super.poison);
	}
}
class Mosquito extends Insect
{   
	String poison="higher";
	Mosquito()
	{   
		System.out.println("Mosquito class");
	}
	//overriding method
	@Override
	public void bite()
	{
		System.out.println("I  am mosquito and bite very hashly with poison like"+poison);
	}
}
