package serialization_deserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) throws IOException {
      Student s=new Student("Shobhit","delhi",30,176,6888);
      FileOutputStream fos = new FileOutputStream(new File("D:/JAVAWORKSPACE/JavaProject/file/serial.text")); 
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(s);
      System.out.println("Object write succesfully");
      fos.close();
      oos.close();
	}

}
