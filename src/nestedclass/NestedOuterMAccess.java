package nestedclass;

class Car
{
	String carName;
	String carType;
	public Car(String carName,String carType)
	{
		this.carName=carName;
		this.carType=carType;
	}
	public String getCarName()
	{
		return carName;
	}
	class Engine
	{
		String EngineType;
		public void setEngineType()
		{
			if(Car.this.carType.equalsIgnoreCase("4WD"))
			{
				if(Car.this.getCarName().equalsIgnoreCase("wagonR"))
				{
					this.EngineType="smaller";
				}
				else if(Car.this.getCarName().equalsIgnoreCase("SwiftDezire"))
				{
					this.EngineType="larger";
				}
			}
			else
			{
				this.EngineType="larger";
			}
			
		}
		public String getEngineType()
		{
			return this.EngineType;
		}
	}
}
public class NestedOuterMAccess {

	public static void main(String[] args) {
		Car c=new Car("WagonR","4WD");
		Car.Engine e=c.new Engine();
		e.setEngineType();
		System.out.println("Engine Type for 4WD:"+e.getEngineType());
		
		Car c1=new Car("BMW","6WD");
		Car.Engine e2=c1.new Engine();
		e2.setEngineType();
		System.out.println("Engine Type for 6WD:"+e2.getEngineType());
		
		
		

	}

}
