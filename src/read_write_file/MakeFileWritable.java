package read_write_file;

import java.io.File;

public class MakeFileWritable {

	public static void main(String[] args) {
		File f = new File("D:/JAVAWORKSPACE/JavaProject/file/newfile.txt");
		if(f.exists())
		{
			f.setWritable(true);
			if(f.canWrite())
			{
				System.out.println(f.getName()+" is writable now");
			}else
			{
			System.out.println(f.getName()+" is still readable only");
		}

	}
	}
}


