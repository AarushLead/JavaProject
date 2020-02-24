package conversion;

public class IntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30;
		String str=String.valueOf(i);   //Method 1
		System.out.println("Method 1 :"+str+555);
		
		int j=40;
		String str2=Integer.toString(j); //Method2
        System.out.println("Method 2 :"+str2+10);
        
        int k=20;
       String str3= String.format("%d", k);
       System.out.println("Method 3 :"+str3);
        
	}

}
