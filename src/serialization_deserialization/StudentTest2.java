package serialization_deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

 //De-serialization
public class StudentTest2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		  Student s=new Student("Shobhit","delhi",30,176,6888);
	      FileInputStream fos = new FileInputStream(new File("D:/JAVAWORKSPACE/JavaProject/file/serial.text")); 
	      ObjectInputStream oos = new ObjectInputStream(fos);
	      Object studentObj = oos.readObject();
	      Student ss = (Student)studentObj;
	      System.out.println(ss.getStuHeight());
	      System.out.println("Object read succesfully");
	      fos.close();
	      oos.close();
	}

}
