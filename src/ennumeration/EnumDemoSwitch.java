package ennumeration;


enum Food {
	NONVEG, VEG, SEAFOOD, FRUIT
}

/**
 * @author Shobhit Sharma
 * @description: (1) use of enum in switch 
 * (2) Iterate the enum
 *
 */
public class EnumDemoSwitch {
	Food fo;

	private EnumDemoSwitch(Food veg) {
		this.fo = veg;
	}

	public void getFood() {
		switch (fo) {
		case NONVEG:
			System.out.println("Food Type: NONVEG");
			break;
		case VEG:
			System.out.println("Food Type: VEG");
			break;
		case SEAFOOD:
			System.out.println("Food Type: SEAFOOD");
			break;
		case FRUIT:
			System.out.println("Food Type: FRUIT");
			break;
		}
	}

	public static void main(String[] args) {
		EnumDemoSwitch eds = new EnumDemoSwitch(Food.VEG);
        eds.getFood();
	}

}
