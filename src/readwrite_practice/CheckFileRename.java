package readwrite_practice;

import java.io.File;

public class CheckFileRename {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "recheck.txt");
		if(file.exists())
		{
			 boolean flag = file.renameTo(new File("D:/JAVAWORKSPACE/JavaProject/file/rename.txt"));
			 if(flag)
			 {
				 System.out.println("file is rename to new name");
			 }
			 else
			 {
				System.out.println("issue in to rename a file"); 
			 }
		}
	}

}
