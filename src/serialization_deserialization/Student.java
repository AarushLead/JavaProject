package serialization_deserialization;

import java.io.Serializable;

public class Student implements Serializable{

	private String StuName;
	private transient String stuAddress;
	private int stuAge;
	private transient int stuHeight;
	private int stuRollNo;

	public Student(String name, String addr, int age, int height, int rollno) {
		this.StuName = name;
		this.stuAddress = addr;
		this.stuAge = age;
		this.stuHeight = height;
		this.stuRollNo = rollno;
	}

	public void setStuName(String name) {
		this.StuName = name;
	}

	public String getStuName() {
		return StuName;
	}

	public void setstuAddress(String address) {
		this.stuAddress = address;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setstuAge(int age) {
		this.stuAge = age;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setstuHeight(int height) {
		this.stuHeight = height;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setstuRollNo(int rollno) {
		this.stuRollNo = rollno;
	}

	public int getStuRollNum() {
		return stuRollNo;
	}

}
