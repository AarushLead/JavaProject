package string;

public class IndexOfExample {

	public static void main(String[] args) {
		String string = "It was hot (so hot!) I'm telling you.";
		String sub=string.substring(string.indexOf("(")+1, string.indexOf(")"));
		sub=sub.toUpperCase();
		String result=string.substring(0, string.indexOf("(")+1)+sub+string.substring(string.indexOf(")"));
		System.out.println(result);
		
		//finding OOP in string
		String string1="It was OOPS and The time of OOPS is more";
		int newstr=string1.indexOf("OOPS");
		System.out.println(newstr);
		int laststr=string1.lastIndexOf("OOPS");
		System.out.println(laststr);
		System.out.println(string1.substring(newstr+1, laststr));
		
		///find all the name in string
		String string2="Once there was a woman name:angelina: and a man name:tony: and their friend name:jane: and .";
		
        
	}

}
