package Week3;

import java.util.Scanner;

class NameAge {

public static void main (String[] args) {


Scanner input = new Scanner(System.in);


System.out.print("Enter your name: ");


String name = input.next();


System.out.print("Enter your age " + name + " :");

int age = input.nextInt();


System.out.println("Hi " + name + ". Good ta see ya!");

System.out.println("In 10 years you will be: "+(age+10));

}
}