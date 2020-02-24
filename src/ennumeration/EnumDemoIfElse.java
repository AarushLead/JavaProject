package ennumeration;

enum Direction
{
	EAST,WEST,SOUTH,NORTH
}
public class EnumDemoIfElse {

	public static void main(String[] args) {
		Direction dir=Direction.SOUTH;
		if(dir==Direction.SOUTH)
		{
			System.out.println("Direction:SOUTH");
		}
		else if(dir==Direction.EAST)
		{
			System.out.println("Direction:EAST");
		}
		else if(dir==Direction.WEST)
		{
			System.out.println("Direction:WEST");
		}
		else if(dir==Direction.NORTH)
		{
			System.out.println("Direction:NORTH");	
		}

	}

}
