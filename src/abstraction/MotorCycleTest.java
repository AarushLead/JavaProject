package abstraction;

public class MotorCycleTest {

	public static void main(String[] args) {

		KTM k=new KTM(180,"Black");
		k.applyBrake(); //Ktm brake is excellent
		HeroHonda hh=new HeroHonda(100,"RED");
		hh.applyBrake();
		Motorcycle mc=new KTM(180,"Black");
		mc.applyBrake(); //Ktm brake is excellent
		}

}
abstract class Motorcycle
{    
    static  int maxSpeed;
	String color;
	public Motorcycle(int ms,String c)
	{
		Motorcycle.maxSpeed=ms; //accessing the static member using class name
		this.color=c;
	}
	abstract void applyBrake();
	abstract void accelerate();
}
class KTM extends Motorcycle
{
	KTM(int speed,String colo)
	{
		super(speed,colo);
		System.out.println("The color of Ktm bike is "+super.color);
	}
	@Override
	void applyBrake()
	{
		System.out.println("Ktm brake is excellent");
	}
	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Ktm bike caught the accelerate in just seconds");
	}
}
class HeroHonda extends Motorcycle
{
	HeroHonda(int speed,String colo)
	{
		super(speed,colo);
		System.out.println("The color of Honda bike is "+super.color);
	}

	@Override
	void applyBrake() {
		System.out.println("Honda brake is low");
		
	}

	@Override
	void accelerate() {
		System.out.println("HeroHonda bike caught the accelerate in just Minute");
		
	}
}
