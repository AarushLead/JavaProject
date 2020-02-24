package conversion;

public class StringIntConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="300";
		int num=Integer.parseInt(str);  //Method 1
		int sum=100+num;
		System.out.println(sum);
		
		int num2=Integer.valueOf("500");  //Method 2
		sum=num2+200;
		System.out.println("NewSum :"+sum);
		
		//leading zeros
		
		String newstr="00000678";
		newstr=String.format("%08d", Integer.parseInt(newstr)+100);
		System.out.println(newstr);

	}

}
