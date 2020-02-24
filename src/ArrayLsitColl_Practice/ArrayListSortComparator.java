package ArrayLsitColl_Practice;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class Studentt implements Comparable<Studentt> {
	String name;
	int age;
	int rollNo;

	Studentt(int rollNo,String name,int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age=age;
	}

	public static Comparator<Studentt> stuNameComp=new Comparator<Studentt>()
	{
	 public int compare(Studentt s1,Studentt s2)
	 {
		 return s1.name.compareTo(s2.name);
	 }};
	public static Comparator<Studentt> stuAgeComp=new Comparator<Studentt>() {
		 public int compare(Studentt s1,Studentt s2) {
			 return s1.age==s2.age?0:s1.age>s2.age?1:-1;
		 }
	 };

	@Override
	public String toString() {
		return "[Name:" + name + ",Age :" + age + ",RollNo:" + rollNo + "]";
	}

	@Override
	public int compareTo(Studentt o) {
		return this.rollNo == o.rollNo ? 0 : this.rollNo > o.rollNo ? 1 : -1;
	}
}
    public class ArrayListSortComparator {

	public static void main(String[] args) {
		 ArrayList<Studentt> al = new ArrayList<Studentt>();
		   al.add(new Studentt(101, "Zues", 26));
		   al.add(new Studentt(505, "Abey", 24));
		   al.add(new Studentt(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(al,Studentt.stuNameComp);
		   for (Studentt abc : al) {
			System.out.println(abc);
			
		    /* Sorting on Rollno property*/
		    System.out.println("\nAge Sorting:");
			Collections.sort(al,Studentt.stuAgeComp);
			for(Studentt str: al){
			System.out.println(str);
			   }
		}
	}

}


