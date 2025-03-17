package Week2;

public class Store {
    
    public static void main(String[] args) {

        double Eggs = 5.95;
        double Grapes = 9.50;
        double Potatoes = 12.99;

        double Total = Eggs + Grapes + Potatoes;
        double GST = Total * 0.10;
        double Pay = Total + GST;
        
        System.out.println("\nWelcome to Wanaka General Store!\n");
        System.out.println("33 Main Street, Wanaka, NZ");
        System.out.println("Contact: +55 123 456 789\n\n");
        System.out.println("TAX INVOICE\n");
        System.out.println("15:45 23/02/2025\n\n");
        System.out.println("Eggs Dozen: " + Eggs);
        System.out.println("Grapes: " + Grapes);
        System.out.println("Potatoes: " + Potatoes);
        System.out.println("\nTotal Cost: $" + Total);
        System.out.println("GST payable: $" + GST);
        System.out.println("\nTotal Cost Inc. GST: $" + Pay + "\n");
    }
}
