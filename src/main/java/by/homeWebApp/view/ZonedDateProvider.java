package by.homeWebApp.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ZonedDateProvider {
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    public String prepareDate(Date currentDate, TimeZone timezone) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_TIME_FORMAT);

        dateFormat.setTimeZone(timezone);

        return dateFormat.format(currentDate);
    }

}
