package Week4;

import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter the name of the representitive: ");
        String name = myInput.nextLine();
        System.out.print("What were this weeks total sales: $");
        double sales = myInput.nextDouble();

        int salary = 200;
        int bonus = 0;
        double commission = 0;
        if (sales > 200) {
            commission = sales * 0.05;
        } 
        if (sales > 2000) {
            bonus = 50;
        }         
        double total = salary + commission + bonus;
        System.out.println("Sales Representative Name: "+name);
        System.out.println("Weekly salary: $"+salary);
        System.out.println("Commissions: "+commission);
        System.out.println("Bonuses: $"+bonus);
        System.out.println("Total Earnings for the week: $"+ total);
    

    }
}


// Salary $200 per week
// 5% for any sale >200
// $50 bonus paid each week if sales is >2000