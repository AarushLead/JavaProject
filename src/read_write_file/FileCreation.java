package read_write_file;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		boolean newfile=false;
		File f=new File("D:/JAVAWORKSPACE/JavaProject/file");
		if(!f.exists())
		{
			if(f.mkdir())
			{
				File ff=new File("D:/JAVAWORKSPACE/JavaProject/file/abc.txt");
				try {
					newfile = ff.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(newfile)
				{
					System.out.println("New FIle created");
				}
				else
				{
					System.out.println("File did not created");
				}
			}
			else
			{
			System.out.println("Folder creation failed");	
			}
		}
		
	}

}
