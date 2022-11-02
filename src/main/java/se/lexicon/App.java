package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {


        while (true) {
            System.out.println("Program to demonstrate Java Date and time API");
            System.out.println("Enter Your option 1.Usage of Local Date and 2: Usage of Local Time");
            switch (display()) {
                case 1:
                    displayWeek.week();
                    break;
                case 2:
                    timeAPI.localTime();
                    break;
                case 3:
                    calendar.calendarusingAPI();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid option");
            }


        }


    }

    public static int display() {
        int option = 0;
        Scanner scan = new Scanner(System.in);

        option = scan.nextInt();
        if (!(option == 1 && option ==2))

            return option;
        else
            throw new RuntimeException("Enter valid option between 1 or 2");

    }


}
