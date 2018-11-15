/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author luong
 */
public class Timezones {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final SimpleDateFormat sdfUK = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss",Locale.UK);
     
    public static void main(String[] args) {
         
        Calendar calLocale = new GregorianCalendar(Locale.getDefault());
        Calendar calGmt = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
         
        System.out.println("1:Local date:" + sdf.format(calLocale.getTime()));
        System.out.println("2:GMT date:" + calGmt.get(Calendar.DAY_OF_MONTH) + "/" + calGmt.get(Calendar.MONTH) + "/" + calGmt.get(Calendar.YEAR) + " " +
                                            calGmt.get(Calendar.HOUR_OF_DAY) + ":" + calGmt.get(Calendar.MINUTE) + ":" + calGmt.get(Calendar.SECOND));
        System.out.println("3:GMT date(parsed):" + sdf.format(calGmt.getTime()));
        System.out.println("4:GMT date(parsedUK):" + sdfUK.format(calGmt.getTime()));
        System.out.println("5:Diff.Local-GMT:"+(calLocale.getTimeInMillis() - calGmt.getTimeInMillis()));
        
        TimeZone localTimezone = TimeZone.getDefault();
        System.out.println("5:Diff.Local-GMT(" + localTimezone.getID() + "):" + localTimezone.getRawOffset() );
        
        Instant instant = Instant.now();
        System.out.println(instant);
        
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTime = sdf.format(new Date());
        System.out.println(utcTime);
    }
}
