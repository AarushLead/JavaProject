package Comparator;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<AuthorComparator>{

	@Override
	public int compare(AuthorComparator o1, AuthorComparator o2) {
		if(o1.age==o2.age)
		{
			return 0;
		}
		else if(o1.age>o2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
