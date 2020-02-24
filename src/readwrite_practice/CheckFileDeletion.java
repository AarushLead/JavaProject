package readwrite_practice;

import java.io.File;

public class CheckFileDeletion {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "englishwrite.txt");
		if(file.exists())
		{
			if(file.delete())
			{
				System.out.println("File deleted ");
			}
			else
			{
				throw new RuntimeException("Error in file deletion");
			}
		}
	}

}
