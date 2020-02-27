package lv.tsi.javacourses.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringDateTime {
    public static final String TIME_PATTERN = "HH-mm";
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN);

    public static LocalTime timeFromString(String strTime) {
        return LocalTime.parse(strTime, TIME_FORMATTER);
    }

    public static String timeToString(LocalTime time) {
        return time.format(TIME_FORMATTER);
    }

    public static final String DATE_PATTERN = "dd.MM.yyyy";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static LocalDate dateFromString (String strDate) {
        return LocalDate.parse(strDate, DATE_FORMATTER);
    }

    public static String dateToString(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }
}
