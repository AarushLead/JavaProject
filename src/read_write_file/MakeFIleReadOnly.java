package read_write_file;

import java.io.File;

public class MakeFIleReadOnly {

	public static void main(String[] args) {
		File f = new File("D:/JAVAWORKSPACE/JavaProject/file/newfile.txt");
		if(f.exists())
		{ 
				boolean flag = f.setReadOnly();
				if(flag==true)
				{
					System.out.println(f.getName()+"has set to read only mode");
				}
			
			else
			{
				System.out.println(f.getName()+ "is in writable mode");
			}
		}
	}

}
