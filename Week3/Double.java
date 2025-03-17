package Week3;

import java.util.Scanner;

public class Double {

    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);

        double num1, num2, sum, diff, prod, quot; 


        System.out.print("Enter first number: ");
        num1= myInput.nextDouble();

        System.out.print("Enter Second number:");
        num2=myInput.nextDouble();

        sum = num1 + num2;
        diff = num1-num2;
        prod = num1*num2;
        quot = num1/num2;

        System.out.println("Sum:" +sum);
        System.out.println("Difference:" + diff);
        System.out.println("Product:" + prod);
        System.out.println("Quotient:" + quot);
       
        


    }
}