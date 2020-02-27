package lv.tsi.javacourses.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    public static Scanner scan = new Scanner(System.in);

    public static String askString(String msg) {
        System.out.print(msg + ": ");
        String tmp = scan.next();
        if (tmp.startsWith("\"")) {
            while (!tmp.endsWith("\"")) {
                tmp = tmp + " " + scan.next();
            }
            tmp = tmp.substring(1, tmp.length()-1);
        }
        return tmp;
    }

    public  static int askInt(String msg, int min, int max) {
        for (;;) {
            int result = askInt(msg);
            if (result < min || result > max) {
                System.out.printf("Value should be in range from %d to %d%n", min, max);
            } else {
                return result;
            }
        }
    }

    public static int askInt(String msg) {
        for (;;) {
            try {
                System.out.print(msg + ": ");
                return scan.nextInt();
            } catch (InputMismatchException e) {
                var str = scan.next();
                System.out.println(str + " isn't integer. Please enter a number");
            }
        }
    }

    public static LocalTime askTime(String msg) {
        for (;;) {
            try {
                var strTime = askString(msg + " (" + StringDateTime.TIME_PATTERN + ")");
                return StringDateTime.timeFromString(strTime);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong time format");
            }
        }
    }

    public static LocalDate askDate(String msg) {
        for (;;) {
            try {
                var strDate = askString(msg + " (" + StringDateTime.DATE_PATTERN + ")");
                return StringDateTime.dateFromString(strDate);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong date format");
            }
        }
    }

}
