package string;

public class RemoveTrailingSpace {

	public static void main(String[] args) {
     System.out.println("#"+trailingspace(" Hi i am licky.  ")+"@");
	}

	private static String trailingspace(String str) {
    
		if(str==null)
		{
			return null;
		}
		for (int i = str.length(); i >0; i--)
		{
			if(!Character.isWhitespace(str.charAt(str.length()-1)))
			{
				break;
			}
		}
		return str.substring(0,str.length());
	}

}
