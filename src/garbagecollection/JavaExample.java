package garbagecollection;

public class JavaExample {

	public static void main(String[] args) {
		JavaExample je = new JavaExample();
		je = null;

		JavaExample a = new JavaExample();
		JavaExample b = new JavaExample();
		a = b;
		System.gc();

	}

	
	  protected void finalize() {
	  System.out.println("Garbage collection is performed by JVM"); }
	 

}
