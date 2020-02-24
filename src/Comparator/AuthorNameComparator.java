package Comparator;

import java.util.Comparator;

public class AuthorNameComparator implements Comparator<AuthorComparator>{

	@Override
	public int compare(AuthorComparator o1, AuthorComparator o2) {
		return o1.firstName.compareTo(o2.firstName);
	}

}