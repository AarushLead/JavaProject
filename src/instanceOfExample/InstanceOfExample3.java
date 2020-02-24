package instanceOfExample;

public class InstanceOfExample3 {

	public static void main(String[] args) {
	 Dayan d=new Dayan();
	 Aatma aa=new Aatma();
	 Ghost gd=new Dayan();
	 Ghost ga=new Aatma();
	
	 d.attack();
	 aa.attack();
	 gd.attack();
	 ga.attack();
	
	 System.out.println("Is gd instance of Ghost :"+(gd instanceof Ghost));
	 System.out.println("Is gd instance of Dayan :"+(gd instanceof Dayan));
	 System.out.println("Is d instance of Ghost :"+(d instanceof Ghost));
	 System.out.println("Is d instance of Dayan :"+(d instanceof Dayan));	 
	 System.out.println("Is ga instance of Aatma :"+(ga instanceof Aatma));
	 System.out.println("Is aa instance of Aatma :"+(aa instanceof Aatma));
	}

}
interface Ghost
{
	void attack();
}
class Dayan implements Ghost
{

	@Override
	public void attack() {
		System.out.println("sucking the age of people");
		
	}
	
}
class Aatma implements Ghost
{

	@Override
	public void attack() {
		System.out.println("Use the body of people");
		
	}
	
}

