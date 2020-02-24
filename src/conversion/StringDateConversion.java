package conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateConversion {

	public static void main(String[] args) {
       String dte="15/02/1990";
       DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
       try {
		Date dd = df.parse(dte);
		String cc = df.format(dd);
		System.out.println(cc);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}

}
