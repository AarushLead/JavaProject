package nestedclass;


class MotherBoard
{
	private static String model;
	public MotherBoard(String model)
	{
	MotherBoard.model=model;
	}
	public String getModel()
	{
		return model;
	}

    static class USB 
	{
		int porusb1 = 5;
		int usb2 = 1;

		public int getTotalPorts()
		{
			if(MotherBoard.model.equals("MSI"))
			{
				return 6;
			}
			else
			{
				return 7;
			}

		}

	}
}

public class StaticInnerClassTest {

	public static void main(String[] args) {
		MotherBoard mb=new MotherBoard("MSI");
		System.out.println("Mother Board Model:"+mb.getModel());
		
		MotherBoard.USB us=new MotherBoard.USB();
	    System.out.println("Total no of port:"+us.getTotalPorts());

	}

}
