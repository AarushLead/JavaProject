package string;

public class CopyOfExample {

	public static void main(String[] args) {
		char[] ch = { 'A', 'B', 'C', 'D','e'};
		String str="abcd";
		String str2="text";
		System.out.println(str.copyValueOf(ch));
		System.out.println(str2.copyValueOf(ch, 1, 2));
	}

}
