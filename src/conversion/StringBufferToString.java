package conversion;

public class StringBufferToString {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("BeginnersBook");
		String str = sb.toString();//convert stringBuffer To String
		System.out.println(str);
		
		
		System.out.println("****Before Append****");
		System.out.println("String Buffer :"+sb);
		System.out.println("String object :"+str);
		
		sb.append(".com");
		
		System.out.println("******After Append*****");
		System.out.println("String Buffer :"+sb);
		System.out.println("String object :"+str);
		
		
	}

}
