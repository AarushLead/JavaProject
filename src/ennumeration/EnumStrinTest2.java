package ennumeration;

enum SizePizza {
SMALL
{
	@Override
	public String toString()
	{
		return "This is small Pizza";
	}
	
},
LARGE
{
	@Override
	public String toString()
	{
		return "This is large Pizza";
	}
},
MEDIUM
{
	@Override
	public String toString()
	{
		return "This is Medium Pizza";
	}
},
EXTRALARGE
{
	@Override
	public String toString()
	{
		return "This is ExtraLarge Pizza";
	}
};}

public class EnumStrinTest2 {

	public static void main(String[] args) {
		 System.out.println(SizePizza.LARGE.toString());
	}

}
