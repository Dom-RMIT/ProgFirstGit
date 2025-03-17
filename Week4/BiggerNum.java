package Week4;

import java.util.Scanner;

public class BiggerNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1, value2;

        System.out.print("Enter your 1st number: ");
        value1 = scanner.nextInt();
        System.out.print("Enter your 2nd number: ");
        value2 = scanner.nextInt();

        if (value1 > value2) {
            System.out.println("The greater number is: " + value1);
        } else if (value2 > value1) {
            System.out.println("The greater number is: " + value2); 
        } else if (value1 == value2) {
            System.out.println("Both numbers are equal.");
        }

    }
    
    
}
