package ArrayLsitColl_Practice;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> as=new ArrayList<Student>();
		as.add(new Student("Shobhit",30));
		as.add(new Student("Mohit",26));
		as.add(new Student("Santosh",23));
		as.add(new Student("PAwan",65));
		as.add(new Student("Shobhit",30));
		
		for (Student student : as) {
			System.out.println(student.toString());
		}

	}

}
