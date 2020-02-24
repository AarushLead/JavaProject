package readwrite_practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteBufferWriter {

	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "englishwrite.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		String s = "To understand a programming language you must practice the programs";
		if (!file.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
			} catch (IOException e) {
				e.getMessage();
			}
			try {
				bw.write(s);
				bw.flush();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if (bw != null && fw != null) {
						bw.close();
						fw.close();
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}

	}
}
