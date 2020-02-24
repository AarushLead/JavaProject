package Comparator;

public class AuthorComparator implements Comparable<AuthorComparator> {
	String firstName;
	String lastName;
	int age;

	public AuthorComparator(String firstName, String lastName,int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int compareTo(AuthorComparator o) {
		return this.lastName.compareTo(o.lastName);
	}
}
