package comparable;

import java.util.ArrayList;
import java.util.Collections;

class Author implements Comparable<Author> {
	String firstName;
	String lastName;
	String bookName;

	public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	@Override
	public int compareTo(Author o) {
		int last = this.lastName.compareTo(o.lastName);
		return last == 0 ? this.firstName.compareTo(o.firstName) : last;
	}
}

class Employee implements Comparable<Employee> {
	String firstName;
	int age;

	public Employee(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;

	}

	@Override
	public int compareTo(Employee o) {
		return this.age == o.age ? 0 : this.age > o.age ? 1 : -1;
	}

}

public class ArrayCustomeSortingTest {

	public static void main(String[] args) {
		 ArrayList<Author> al=new ArrayList<Author>(); 
	      al.add(new Author("Henry","Miller", "Tropic of Cancer"));  
	      al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
	      al.add(new Author("Frank","Miller", "300"));
	      al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
	      al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
	      Collections.sort(al);
	      System.out.println("Sorted array of Author:");
	      for (Author author : al) {
	    	  System.out.println(author.firstName+","+author.lastName+","+author.bookName);
	      System.out.println();
	   
	      
	      ArrayList<Employee> al2=new ArrayList<Employee>(); 
	      al2.add(new Employee("Henry",33));  
	      al2.add(new Employee("Nalo",18));
	      al2.add(new Employee("Frank",30));
	      al2.add(new Employee("Deborah",20));
	      al2.add(new Employee("George R.", 99));
	      Collections.sort(al2);
	      System.out.println("Sorted array of Employee by Age:");
	      for (Employee employee : al2) {
	    	  System.out.println(employee.firstName+","+employee.age);
	      System.out.println();
		}
	}

	}
}
