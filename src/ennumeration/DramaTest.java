package ennumeration;

enum Drama {
	PLAY("Hi, I am Play"), ACTOR("hI, I AM ACTOR");

	String dramaname;

	Drama(String d) {
		this.dramaname = d;
	}

	public String getName() {
		return this.dramaname;
	}
}

public class DramaTest {
	public static void main(String[] args) {
Drama dr=Drama.ACTOR;
	System.out.println(dr.getName());

}
}

