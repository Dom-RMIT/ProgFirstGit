package Week4;
import java.util.Scanner;

public class EggSize {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the egg weight in grams: ");
    int eggWeight = scanner.nextInt();
    String size = "";

    if (eggWeight > 72) {
        size = "King-Size";
    } else if (eggWeight >= 68 && eggWeight <=72) {
        size = "Jumbo";
    } else if (eggWeight >= 60 && eggWeight <=67) {
        size = "Extra-Large";
    } else if (eggWeight >= 52 && eggWeight <=59) {
        size = "Large";
    } else if (eggWeight >= 43 && eggWeight <=51) {
        size = "Medium";
    } else if (eggWeight < 43) {
        size = "Too small";
    }
    System.out.println("The size of the egg is: " +size);


}
}
