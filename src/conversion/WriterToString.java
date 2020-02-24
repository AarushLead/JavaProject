package conversion;

import java.io.StringWriter;

public class WriterToString {

	public static void main(String[] args) {
		StringWriter sw=new StringWriter();
		sw.append("abc");
		sw.append("pqr");
		String str=sw.toString();
		System.out.println(str);
		

	}

}
