package Week3;

import java.util.Scanner;

public class RunTotal {
public static void main(String[] args) {

Scanner myInput = new Scanner(System.in);


int total, num1, num2, num3, num4;


System.out.print("Enter 1st number: ");

num1 = myInput.nextInt();
total = num1;
System.out.println("Running total: "+total);


System.out.print("Enter 2nd number: ");

num2 = myInput.nextInt();
total = total + num2;
System.out.println("Running total: "+total);

System.out.print("Enter 3rd number: ");

num3 = myInput.nextInt();
total = total + num3;
System.out.println("Running total: "+total);

System.out.print("Enter 4th number: ");

num4 = myInput.nextInt();
total = total+ num4;
System.out.println("Running total: "+total);


total = num1+num2+num3+num4;


System.out.println("Sum of "+num1+", "+num2+", "+num3+ ", " +num4+ " is "+total);

}

}

