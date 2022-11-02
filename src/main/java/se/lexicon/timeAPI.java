package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeAPI {

    public static void localTime() {
        //Ex: 9
        LocalTime time = LocalTime.now();
        System.out.println("\nlocal Time:" + time);

        //Ex:10

        DateTimeFormatter ns = DateTimeFormatter.ofPattern("ss.SSSSS");
        System.out.println("\nNano Seconds:" + time.format(ns));

        //Ex:11
        LocalTime time1 = LocalTime.parse("12:20:33");
        System.out.println("\nTime using parse:" + time1);

        //Ex:12
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("\nLocal time formatted:" + time.format(format1));

        //Ex:13
        LocalDateTime LDT = LocalDateTime.now();
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        System.out.print("Date:" + LDT.format(format3));
        System.out.println("\tTime:" + LDT.format(format2));

        //Ex:14
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE dd MMMM HH:MM");
        System.out.println("\nDate:" + LDT.format(format4));

        // Ex:15
        LocalTime Lt = LocalTime.now();
        LocalDate Ld = LocalDate.now();
        LocalDateTime ld = LocalDateTime.of(Ld, Lt);
        System.out.println("\nLocal date and time by combining date and time object:" + ld);

        //Ex:16
        LocalDate ldd = LDT.toLocalDate();
        LocalTime ldt = LDT.toLocalTime();
        System.out.println("\nLocal date and time from LocalDateTime object:" + ldd + ldt+ "\n");

    }
}
