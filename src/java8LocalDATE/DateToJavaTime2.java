package java8LocalDATE;
//import java.time.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToJavaTime2 {

    public static void main(String[] args) {

        //Asia/Kuala_Lumpur +8
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("System Default TimeZone : " + defaultZoneId);

        //toString() append +8 automatically.
        Date date = new Date();
        System.out.println("date : " + date);

        //1. Convert Date -> Instant
        Instant instant = date.toInstant();
        System.out.println("instant : " + instant); //Zone : UTC+0

        //2. Instant + system default time zone + toLocalDate() = LocalDate
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
        System.out.println("localDate : " + localDate);
        
        ///.using local date constructors
        
      //2. Instant + system default time zone + toLocalDate() = LocalDate
        LocalDate localDate2 = LocalDate.now();
        System.out.println("localDate2 : " + localDate2);
        
        LocalDate localDate3 = LocalDate.now(defaultZoneId);
        System.out.println("localDate3 : " + localDate3);
        
        
        //3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
        LocalDateTime localDateTime =  LocalDateTime.now();
        System.out.println("...LocalDateTime : " + localDateTime);
        
      

       
    }

}