package Week3;

import java.util.Scanner;

public class Total {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


int num1, num2, num3, total;


System.out.print("Enter 1st number: ");

num1 = scanner.nextInt();

System.out.print("Enter 2nd number: ");

num2 = scanner.nextInt();

System.out.print("Enter 3rd number: ");

num3 = scanner.nextInt();


total = num1+num2+num3;


System.out.println("Sum of "+num1+", "+num2+", "+num3+" is "+total);

}

}

