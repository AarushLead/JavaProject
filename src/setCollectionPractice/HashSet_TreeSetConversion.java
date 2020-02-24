package setCollectionPractice;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_TreeSetConversion {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Apple");
		set.add("Orange");
		// Displaying element of hashset
		System.out.println(set);

		// Method 1:creating a Treeset
		TreeSet<String> tset = new TreeSet<String>();
		tset.addAll(set);

		// Method 2: Creating a TreeSet of HashSet elements
		TreeSet<String> tset2 = new TreeSet<String>(set);

		// Iteration of treeset element of method 1
		for (String string : tset) {
			System.out.println(string);
		}

		System.out.println("\n");

		// Iteration of treeset element of method 2
		for (String string : tset2) {
			System.out.println(string);
		}
	}

}
