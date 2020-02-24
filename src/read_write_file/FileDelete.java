package read_write_file;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File oldfile = new File("D:/JAVAWORKSPACE/JavaProject/file/xyz.text");
		if(oldfile.exists())
		{
			boolean flag=oldfile.delete();
			if(flag) {
				System.out.println(oldfile.getName()+" is deleted");
			}
			else
			{
				System.out.println(oldfile.getName()+" is not deleted");
			}
		}
	}

}
