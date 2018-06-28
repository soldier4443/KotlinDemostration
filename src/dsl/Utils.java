package dsl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nyh0111 on 2018-06-27.
 */
public class Utils {
    
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public static Date parseDate(String string) {
        Date date = null;
        
        try {
            date = dateFormat.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return date;
    }
    
    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }
    
    public static String removeZerosBefore(String userAnswer) {
        if (!userAnswer.isEmpty())
            userAnswer = userAnswer.replaceFirst("^0+(?!$)", "");
        return userAnswer;
    }
    
    public static void main(String[] args) {
        Date date = new Date();
        
        String formatted = formatDate(date);
        Date newDate = parseDate(formatted);
    }
}
