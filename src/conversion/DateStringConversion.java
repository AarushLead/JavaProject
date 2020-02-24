package conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringConversion {

	public static void main(String[] args) {
       Date date=new Date();
       DateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
       String str = df.format(date); //convert date to string
       System.out.println(str);
	}

}
