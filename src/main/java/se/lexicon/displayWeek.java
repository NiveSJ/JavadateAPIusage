package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class displayWeek {
    public static void week() {

        int i = 1;
        //Ex 1:
        LocalDate todaydate= LocalDate.now();
        System.out.println("Today date:" + todaydate);


        // Ex 2: date and time
        DateTimeFormatter date = DateTimeFormatter.ofPattern("EEEE dd MMMM ");
        String Formdate= todaydate.format(date);
        System.out.println("Formatted date:"+ Formdate);
        //  System.out.println("Date and time format date:" + " "+todaydate.getDayOfWeek()+" " +todaydate.getDayOfMonth()+" "+todaydate.getMonth());

        // Exercise 3
        LocalDate lastMonday = LocalDate.parse("2022-10-24");
        System.out.println("Ex3: Displaying entire week");
        while (i <= 7) {
            LocalDate newdate = lastMonday.plusDays(i);
            System.out.println("\t" + lastMonday.plusDays(i));
            i++;
        }

        // Exercise 4
        LocalDate withparse = LocalDate.parse("2022-10-31");
        System.out.println("\nEx 4:Date and time with parse method:" + withparse);

        // Exercise 5
        LocalDate withEnum = LocalDate.now();
        System.out.println("\nEx 5: Day of week:" + withEnum.getDayOfWeek());

        // Exercise 6
        LocalDate withupdates = LocalDate.now();
        withupdates = withupdates.plusYears(10).minusMonths(10);
        System.out.println("\n EX 6: Month:" + withupdates.getMonth());

        // Creating period Exercise 7
        LocalDate myBirthDate = LocalDate.parse("1991-10-27");
        Period period = Period.between(myBirthDate, withEnum);
        System.out.println("Ex 7 :Period between my birthdate and today:" + +period.getYears() + " Years" + "\t" + period.getMonths() + " Months" + "\t" + period.getDays() + " Days\n");

        // Ex : 8
        //LocalDate
        Period per = Period.ofYears(4);
        Period nn = per.plus(Period.ofMonths(7));
        Period dd = nn.plus(Period.ofDays(29));
        Temporal temp = dd.addTo(LocalDate.now());
        System.out.println(temp);

    }
}
