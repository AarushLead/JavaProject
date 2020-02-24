package conversion;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
        String str="hi,i,have,32,and,47";
        String[] strarr=str.split(",");
        List<String> li=Arrays.asList(strarr); //copy all element of string array to list
        for (String string : li) {
			System.out.println(string);
		}
        
	}

}
