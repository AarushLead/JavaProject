package readwrite_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleString {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the line of text (press 'stop' to quit):");
		String str = null;
		do
		{
			try {
				str=br.readLine();
			} catch (IOException e) {
				
			}
		}while(!str.equalsIgnoreCase("stop"));
		System.out.println("Thank you");

	}

}
