package read_write_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyToAnotherFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:/JAVAWORKSPACE/JavaProject/file/newfile.txt");
			fos = new FileOutputStream("D:/JAVAWORKSPACE/JavaProject/file/pqr.txt");
			int line = 0;
			byte[] buffer=new byte[1024];
			try {
				while ((line = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, line);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null && fos != null) {
					fis.close();
					fos.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		}
	}
}
