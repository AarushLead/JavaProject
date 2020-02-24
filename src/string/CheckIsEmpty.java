package string;

import java.util.Arrays;

public class CheckIsEmpty {

	public static void main(String[] args) {
		String str = "";
		String str2="\t\t";
		String str3="    ";
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		String str4="abcd";
		String str5="ABCD";
		String str6="abcd";
		System.out.println(str4.contentEquals(str6));
		StringBuffer bf=new StringBuffer();
		bf.append("abcd");
		System.out.println(str5.contentEquals(bf));
		StringBuilder sb=new StringBuilder();
		sb.append("pqrs");
		String str8="pqrs";
		System.out.println(str8.contentEquals(sb));
		System.out.println("1234".startsWith("12"));
		System.out.println("12345".startsWith("23",1));
		char[] ch=new char[5];
		str8.getChars(2, 4, ch, 1);
		System.out.println(Arrays.toString(ch));
		
		//index of
		String file="city(Denver) AND state(Colorado)";
		String state=file.substring(file.indexOf("state(")+6,file.lastIndexOf(")"));
		System.out.println(state);
		System.out.println(file.indexOf("state("));
		
		String str11 = "Here there everywhere";
		System.out.println(str11.indexOf("re"));
		System.out.println(str11.indexOf("th"));
		System.out.println(str11.indexOf("every"));
		System.out.println(str11.substring(5, 8));
		
		

	}

}
