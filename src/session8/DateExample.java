package session8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateExample {
    public static void main(String[] args) throws InterruptedException {
       int minute = 5;
       // convert minute -> milis
//        int minuseccond = minute * 60 * 1000;
//        System.err.println(minuseccond);
//        System.err.println(TimeUnit.MINUTES.toMillis(minute));
//        System.err.println(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()) / 365);
        // Date
        Date date1 = new Date();
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        Date date2 = new Date(System.currentTimeMillis());
        // compare date
        int compare = date1.compareTo(date2); // 0 bằng nhau , < 0  :date 1 before date2
        System.err.println(compare);
        System.err.println("date1 before date2 " + date1.before(date2));
        System.err.println("date1 after date2 " + date1.after(date2));
        System.err.println(convertDateToString(date1));
        System.err.println(convertDateToString(date2));
        testCalendar();
    }
    public static String convertDateToString(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(calendar.getTime());
    }
    public static void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.err.println("year : "+ year + " month : "+ month+" day : "+ day+" hour : "+ hour
        +" minute : "+ minute+" seccond : "+ second);
    }
}
