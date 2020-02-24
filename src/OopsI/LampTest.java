package OopsI;

/**
 * @author Shobhit Sharma
 * @description here isOn(variable),turnOff(methods) and turnOn(methods) are the
 *              members of class Lamp
 *
 */
public class LampTest {

	public static void main(String[] args) {
		Lamp l = new Lamp();
		l.turnOn();
		l.displayLightStatus();

	}

}

  class Lamp {

	private boolean isOn; // state of an Lamp

	// behaviour 1
	public void turnOff() {
		isOn = false;
	}

	// behaviour 2
	public void turnOn() {
		isOn = true;
	}
	public void displayLightStatus()
	{
		System.out.println("Light is On ?"+isOn);
	}
}

