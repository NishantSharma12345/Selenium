package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateClass
{
    public static String dateFormat()
    {
            Date d = new Date() ;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String currentTime = sdf.format(d);
            return currentTime;
    }
}
