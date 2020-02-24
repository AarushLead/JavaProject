package readwrite_practice;

import java.io.File;

public class CheckFileHidden {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "pqr.txt");
		if(file.isHidden())
		{
			System.out.println("file is hidden");
		}
		else
		{
			throw new RuntimeException("The file is not hidden");
		}
	}

}
