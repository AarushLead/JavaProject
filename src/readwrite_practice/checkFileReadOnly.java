package readwrite_practice;

import java.io.File;

public class checkFileReadOnly {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "punjabiwrite.txt");
		if(file.exists())
		{
			 if(file.canWrite())
			 {
				  boolean flag = file.setReadOnly();
				  if(flag)
				  {
					  System.out.println("file is set to read only mode");
				  }
				  else
				  {
					  System.out.println("file is not set to read only mode");  
				  }
			 }
			 else
			 {
				 System.out.println("file is read only");
			 }
		}
	}

}
