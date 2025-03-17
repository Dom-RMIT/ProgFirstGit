//Dominique Lovett s4092252
package Week5;
import java.util.Scanner;
public class Prac1ASSESS {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        String colour= "";

        System.out.print("Enter a colour: ");
        colour=myInput.nextLine();

        if(colour.equals("blue")){
            System.out.println("You have Won! Congratulations.");
        } else if (colour.equals("red")){
            System.out.println("You have come in second place.");
        } else if(colour.equals("green")) {
            System.out.println("You have come in third place.");
        } else if(colour.equals("yellow")) {
            System.out.println("You have come in forth place.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
