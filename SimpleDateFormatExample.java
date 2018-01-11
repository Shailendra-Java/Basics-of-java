import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {

    public static void main(String[] args) {

        Date curDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);
        format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);
        try {
            Date strToDate = format.parse(DateToStr);
            System.out.println(strToDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
