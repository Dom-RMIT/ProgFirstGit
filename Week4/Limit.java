
package Week4;

import java.util.Scanner;
public class Limit {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of the interval: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper limit of the interval: ");
        int upper = scanner.nextInt();
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number >= lower && number <= upper) {
            System.out.println("The number "+number+" lies between integers "+lower+" and "+upper);
        } else if (number < lower || number > upper) {
            System.out.println("The number "+number+" does not lie between integers "+lower+" and "+upper);
        }
    }
}
