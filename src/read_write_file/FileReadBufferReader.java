package read_write_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBufferReader {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:/JAVAWORKSPACE/JavaProject/file/abc.txt");
		FileReader fr1=null;
		BufferedReader br1=null;
		BufferedReader br2=null;
		   //One way of reading the file
		   System.out.println("Reading the file using readLine() method:");
		try {
			fr1=new FileReader(f);
			br1=new BufferedReader(fr1);
			String contentLine=null;
			try {
				while((contentLine = br1.readLine())!=null)
				{
					System.out.println(contentLine);
				}
			} catch (IOException e) {
				System.out.println("IO Exception :"+e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found :"+e.getMessage());
			
		}
		
		   //Second way of reading the file
		   System.out.println("\nReading the file using read() method\n");
		   br2=new BufferedReader(new FileReader("D:/JAVAWORKSPACE/JavaProject/file/abc.txt"));
		    int line=0;
		   try {
			while((line=br2.read())!=-1)
				{
				   System.out.print((char)line);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
