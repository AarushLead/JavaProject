package read_write_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String content="This is my Data which needs" +
			     " to be written into the file";
		File f=new File("D:/JAVAWORKSPACE/JavaProject/file/pqr.text");
		FileOutputStream fos=new FileOutputStream(f);
		if(!f.exists())
		{
			f.createNewFile();
		}
		byte[] b = content.getBytes();  //used to convert string to byte array
		fos.write(b);  //used to write into file
		fos.flush();
		System.out.println("file written successfully");
		fos.close();
	}

}
