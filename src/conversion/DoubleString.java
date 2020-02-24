package conversion;

public class DoubleString {

	public static void main(String[] args) {
	 double dob=45.87;
	 StringBuffer sb=new StringBuffer();  //method1
	 sb.append(dob);
	 String str=sb.toString();
	 System.out.println(str);
	 
	// method2
	 String str2=String.valueOf(dob);
	 System.out.println(str2);
	 
	//method3
	 String str3=Double.toString(dob);
	 System.out.println(str3);
	 
	 //method4
	 String str4=String.format("%f", dob);
	 System.out.println(str4);
	}

}
