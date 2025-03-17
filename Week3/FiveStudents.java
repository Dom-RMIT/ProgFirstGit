package Week3;

import java.util.Scanner;

class FiveStudent {

public static void main (String[] args) {


Scanner myInput = new Scanner(System.in);

String n1,n2,n3,n4,n5;
int a1,a2,a3,a4,a5;

System.out.print("Enter the first name: ");
n1 = myInput.next();
System.out.print("Enter the first age " + n1 + " :");
a1 = myInput.nextInt();

System.out.print("Enter the second name: ");
n2 = myInput.next();
System.out.print("Enter the second age " + n2 + " :");
a2 = myInput.nextInt();

System.out.print("Enter the third name: ");
n3 = myInput.next();
System.out.print("Enter the third age " + n3 + " :");
a3 = myInput.nextInt();

System.out.print("Enter the forth name: ");
n4 = myInput.next();
System.out.print("Enter the forth age " + n4 + " :");
a4 = myInput.nextInt();

System.out.print("Enter the fifth name: ");
n5 = myInput.next();
System.out.print("Enter the second age " + n5 + " :");
a5 = myInput.nextInt();


System.out.println( n1+ " you are " +a1+ ", " +n2+ " you are " +a2+ ", " +n3+ " you are " +a3+ ", " +n4+ " you are " +a4+ ", " +n5+ " you are " +a5);


}
}