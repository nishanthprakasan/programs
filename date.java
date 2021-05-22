import java.util.Date;
import java.text.*;
public class date
{
    public static void main(String args[])
    {
        Date date = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' HH:mm:ss a zzz ");
        System.out.println("Current Date: " + ft.format(date));
    }
}