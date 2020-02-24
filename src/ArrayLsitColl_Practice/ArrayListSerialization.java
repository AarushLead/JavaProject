package ArrayLsitColl_Practice;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {

	public static void main(String[] args) throws IOException {
	ArrayList<String> als=new ArrayList<String>();
	als.add("Hello");
	als.add("Hi");
	als.add("Howdy");
	
	FileOutputStream  fos=new FileOutputStream(new File("D:/JAVAWORKSPACE/JavaProject/file/serial.text"));
	ObjectOutputStream  oos=new ObjectOutputStream(fos);
	oos.writeObject(als);
	oos.close();
	fos.close();
	
	}

}
