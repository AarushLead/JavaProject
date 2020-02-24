package string;

public class CharAtExample2 {

	public static void main(String[] args) {
		String str = "BeginnerBook";
		int  count=0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)=='n')
			{
				count++;
			}
			
		}
		System.out.println("No of character is :"+count);
	}

}
