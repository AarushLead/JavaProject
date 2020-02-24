package ArrayLsitColl_Practice;

public class Student {
  String name;
  int age;
	
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Name is:"+name+" "+"AGe is :"+age;
	}
}
