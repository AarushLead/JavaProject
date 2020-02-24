package exceptionPractice;

public class UseCustomeException {

	public static void main(String[] args) {
		try {
			throw new WarningException("Hello buddy you are on risk");
		} catch (WarningException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
