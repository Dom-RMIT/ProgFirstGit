package Week4;

import java.util.Scanner;

public class speedLimit {

    Scanner myInput = new Scanner(System.in);

    public void main(String[] args) {

        int speed;
        System.out.print("How much were you exceeding the speed limit by?: ");
        speed = myInput.nextInt();

        int Penalty = 0;
        int Demerit=0;
        String LicenseSus= "";

        if (speed < 10) {
            Penalty= 247;
            Demerit= 1;
            LicenseSus = "N/A";
        } else if (speed >= 20 && speed <= 24){
            System.out.print("What speed zone were you in?: ");
            int zone = myInput.nextInt();
            if (zone == 110){
                Penalty = 395;
                LicenseSus = "3 Months";
            } else if(zone != 110) {
                Penalty = 395;
                Demerit = 3;
                LicenseSus= "N/A";
            }
            } else if (speed >=10 && speed <=19) {
                Penalty = 395;
                Demerit = 3;
                LicenseSus= "N/A";
            } else if (speed >=25 && speed <=29) {
                Penalty = 543;
                LicenseSus= "3 Months";
            } else if (speed >=30 && speed <=34) {
                Penalty = 642;
                LicenseSus= "3 Months";
            } else if (speed >=35 && speed <=39) {
                Penalty = 741;
                LicenseSus= "6 Months";
            } else if (speed >=40 && speed <=44) {
                Penalty = 840;
                LicenseSus= "6 Months";
            } else if (speed >=45) {
                Penalty = 988;
                LicenseSus= "12 Months";
            } 

            System.out.println("Penalty: $"+Penalty+ " Demerit Points: "+Demerit+ " License Suspension: "+LicenseSus);




        }
        
    }
    
    

