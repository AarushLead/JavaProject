package wideningMEthodoverloading;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		float b = (float) a; // widening
		System.out.println("Widening " + b);

		float c = a; // auto-widening
		System.out.println("Auto widening"+c);
	}

}
