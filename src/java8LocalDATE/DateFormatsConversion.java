package java8LocalDATE;
//import java.time.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateFormatsConversion {

    public static void main(String[] args) {

        //Asia/Kuala_Lumpur +8
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("System Default TimeZone : " + defaultZoneId);

        //toString() append +8 automatically.
        Date date0 = new Date();
        System.out.println("date : " + date0);
        
        String pattern1 = "dd-yyyy-MM";
        String pattern2 = "yyyy-MM-dd";
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
        
        System.out.println("date :------------------------> " + date0);

        String date1 = simpleDateFormat.format(date0);
        String date2 = simpleDateFormat2.format(date0);
        
        System.out.println("date :-------------> " + date1);
        System.out.println("date :-------------> " + date2);
        
        
        
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");

        Date parsed_date = null;
        String con_date = null;
		try {
			parsed_date = (new SimpleDateFormat("dd-MM-yyyy")).parse("01-12-2018");
			con_date = (new SimpleDateFormat("yyyy-MM-dd")).format(parsed_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("parsed_date:-------------> " + parsed_date);
        System.out.println("con_date-------------> " + con_date);

       
    }

}