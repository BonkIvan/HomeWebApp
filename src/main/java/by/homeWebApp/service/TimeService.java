package by.homeWebApp.service;

import by.homeWebApp.exception.ZoneConversionException;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class TimeService {

    public Date getCurrentDate(){
        return new Date();
    }

    public TimeZone getTimeZone(String value) {
        if (value == null || value.isBlank()) {
            return TimeZone.getDefault();
        }
        try {
            ZoneId.of(value);
        } catch (DateTimeException e) {
            throw new ZoneConversionException("Cannot parse zone from value "+value);
        }
        return TimeZone.getTimeZone(value);
    }

    }


