package ArrayLsitColl_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSubList {

	public static void main(String[] args) {
     ArrayList<String> arrlist=new ArrayList<String>();
     arrlist.add("Poonam");
     arrlist.add("manisha");
     arrlist.add("satish");
     arrlist.add("chanchal");
     
     //storing a sublist into arraylist
     ArrayList<String> avr = new ArrayList<String>(arrlist.subList(1, 3));
     for (int i = 0; i < avr.size(); i++) {
		System.out.println(avr.get(i));
	}
     
     //storing a sublist into list
     List<String> avr2 = arrlist.subList(1, 3);
     Iterator<String> itr = avr2.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
	 }
	}

}
