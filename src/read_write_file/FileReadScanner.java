package read_write_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("D:/JAVAWORKSPACE/JavaProject/file/abc.txt"));
			while(sc.hasNextLine()){
			    String str = sc.nextLine();  
			    System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
