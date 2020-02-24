package readwrite_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBufferReader {
	public static void main(String[] args) {
		String location = "D:/JAVAWORKSPACE/JavaProject/file";
		File f = new File(location);
		File file = new File(f, "englishwrite.txt");
		BufferedReader br = null;
		BufferedReader br2 = null;
		try {
			// One way of reading the file
			System.out.println("Reading the file using read() method:");
			br = new BufferedReader(new FileReader(file));
			int line = 0;
			try {
				while ((line = br.read()) != -1) {
					System.out.print((char) line);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		// second way of reading the file
		System.out.println("\n\nReading the file using readLine() method:\n");
		try {
			br2 = new BufferedReader(new FileReader("D:/JAVAWORKSPACE/JavaProject/file/recheck.txt"));
			try {
				String content = "";
				while ((content = br2.readLine()) != null) {
					System.out.println(content);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
