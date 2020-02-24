package nestedclass;

class CPU
{
	class Procesor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 5.5;
		}
		
	}
	class Ram
	{		
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			return 4.5;
		}
		
	}
}
public class NestedClassTest {

	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Procesor pro=cpu.new Procesor();
		CPU.Ram ram=cpu.new Ram();
		System.out.println("Processor cache:"+pro.getCache());
		System.out.println("Ram clock speed:"+ram.getClockSpeed());
				

	}

}
