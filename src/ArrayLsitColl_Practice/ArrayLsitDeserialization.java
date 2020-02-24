package ArrayLsitColl_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayLsitDeserialization {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<String> arraylist = new ArrayList<String>();
		FileInputStream fos = new FileInputStream(new File("D:/JAVAWORKSPACE/JavaProject/file/serial.text"));
		ObjectInputStream oos = new ObjectInputStream(fos);
		arraylist = (ArrayList) oos.readObject();
		for (String tmp : arraylist) {
			System.out.println(tmp);
		}

	}

}
