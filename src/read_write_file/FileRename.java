package read_write_file;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		File oldfile = new File("D:/JAVAWORKSPACE/JavaProject/file/abc.txt");
		File newfile = new File("D:/JAVAWORKSPACE/JavaProject/file/newfile.txt");
		if(oldfile.exists())
		{
			boolean flag = oldfile.renameTo(newfile);
			if(flag==true)
			{
				System.out.println(oldfile.getName()+" name has changed to "+newfile.getName());
			}
			else
			{
				System.out.println(oldfile.getName()+" name has not changed ");
			}
		}
	}

}
