package readwrite_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleChar {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character(press 'q' to quit):");
		char line;
		char ch;
		try {
			do
			{
			 ch=(char)br.read();
			}while(ch!='q');
			System.out.println("Thank you");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
