package setCollectionPractice;

import java.util.HashSet;


/**
 * @author Shobhit Sharma
 * Only one null value allowed
 * Duplicate value not allowed
 * Hash Set is non synchronozied
 * Faster in performance
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Apple");
		set.add("Orange");
		set.add(null);
		set.add(null);
		for (String str : set) {
			System.out.println(str);
		}
		
		//Delete all the element
		set.clear();
		System.out.println(set);
		
		//Remove a specified alement from set
		set.remove("Mango");
		System.out.println(set);

	}

}
