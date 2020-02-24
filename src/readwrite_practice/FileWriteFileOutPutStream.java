package readwrite_practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteFileOutPutStream {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "punjabiwrite.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		if(!file.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			String s = "hello punjabi song";
			try {
				byte[] b = s.getBytes();
				bos.write(b);
				bos.flush();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null && bos != null) {
					fos.close();
					bos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}

}
