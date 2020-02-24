package readwrite_practice;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		String location="D:/JAVAWORKSPACE/JavaProject/file";
		File f=new File(location);
		if(f.exists())
		{
			File file=new File(f,"recheck.txt");
			try {
				if(file.createNewFile())
				{
					System.out.println(f.getName()+"is created at location:"+location);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println(location +"Does not exist");
		}

	}

}
