package read_write_file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		File f = new File("D:/JAVAWORKSPACE/JavaProject/file/abc.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		if (f.exists()) {
			try {
				// to read the file
				fis = new FileInputStream(f);
				// for fast read operation using buffer array
				bis = new BufferedInputStream(fis);
				try {
					// used to check the end of file
					// return 0 if no more byte in file to read
					while (bis.available() > 0) {
						int line;
						//to check the content in file 
						//return 0 when the pointer reaches to the end of the file.
						if((line=bis.read())!=-1)
						{
							System.out.print((char)line); 
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				System.out.println("Exception :" + e.getMessage());
			} finally {
				try {
					if (fis != null && bis != null) {
						fis.close();
						bis.close();
					}
				} catch (IOException ioe) {
					System.out.println("Error in InputStream close(): " + ioe);
				}
			}

		}
	}

}
