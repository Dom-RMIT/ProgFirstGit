package Week3;

import java.util.Scanner;

public class Date2 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String day, month;
    int date, year;

    System.out.print("Enter the day: ");

    day = scanner.next();
    System.out.print("Enter the month: ");

    month= scanner.next();
    System.out.print("Enter todays date: ");
    date = scanner.nextInt();
    System.out.print("Enter the year: ");
    year = scanner.nextInt();

    System.out.println("\nAmerican Format: " + day + ", " + month + " " + date + ", " + year + ".");
    System.out.println("European Format: " + day + ", "+ date + " " + month + ", "+ year + ".");
    System.out.println("Japanese Format: " + year + ", " + month + " " + date + ", " + day + ".\n");
}
}
