package Week2;

public class Date {

    public static void main(String[] args) {
        
        String day = "Sunday";
        String month = "February";

        int date = 23;
        int year = 2025;

        System.out.println("\nAmerican Format: " + day + ", " + month + " " + date + ", " + year + ".");
        System.out.println("European Format: " + day + ", "+ date + " " + month + ", "+ year + ".");
        System.out.println("Japanese Format: " + year + ", " + month + " " + date + ", " + day + ".\n");
    }
    
}
