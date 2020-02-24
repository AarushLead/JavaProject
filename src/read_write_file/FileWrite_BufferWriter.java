package read_write_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_BufferWriter {

	public static void main(String[] args) {

		String content = "This is my Data which needs" + " to be written into the file";
		File f = new File("D:/JAVAWORKSPACE/JavaProject/file/xyz.text");
		FileWriter fw = null;
		BufferedWriter bw = null;
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw); //used to write as character-output stream
			bw.write(content);   //used to write the text into file
			System.out.println("file written successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if ( bw != null) {					
					bw.close();
				}
			} catch (Exception io) {
				 System.out.println("Error in closing the BufferedWriter"+io.getMessage());
			}
		}

	}

}
