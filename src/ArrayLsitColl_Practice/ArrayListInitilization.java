package ArrayLsitColl_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListInitilization {

	public static void main(String[] args) {

		// 1st Method using Arrays.asList()
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 67, 87, 90, 100, 200, 300));

		/* For Loop for iterating ArrayList */
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		/* Advanced For Loop */
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

		/* While Loop for iterating ArrayList */
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

		/* Looping Array List using Iterator */
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer it = itr.next();
			System.out.print(it + " ");
		}
		
		/* Looping Array List using enumerator */
		Enumeration<Integer> enu = Collections.enumeration(list);
		while (enu.hasMoreElements()) {
			Integer integer = enu.nextElement();
			System.out.println(integer);
			
		}
	}

}
