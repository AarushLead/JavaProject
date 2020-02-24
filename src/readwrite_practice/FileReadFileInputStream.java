package readwrite_practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadFileInputStream {

	public static void main(String[] args) {
		String location="D:/JAVAWORKSPACE/JavaProject/file";
		File f=new File(location);
		File file=new File(f,"recheck.txt");
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		try {
			 fis=new FileInputStream(file);
			 bis=new BufferedInputStream(fis);
			try {
				if(bis.available()>0)
				{
					int line=0;
					while((line=bis.read())!=-1)
					{
						System.out.print((char)line);
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(bis!=null && fis!=null)
				{
					bis.close();
					fis.close();
				}
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
		}
		
	}
	}
}
