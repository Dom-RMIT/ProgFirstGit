package Week4;

public class Fruits {
    
    public static void main(String[] args) {
        
        final int MAX = 25, LIMIT = 100;
        int num1 = 12, num2 = 25, num3 = 87;

        if (num1 < MAX)
        System.out.println ("apple");
        
        if (num2 <= MAX)
        System.out.println ("apple");
        System.out.println ("orange");

        if (MAX > num3)
        System.out.println ("apple");
        System.out.println ("orange");

        if (num3 >= LIMIT) System.out.println
        ("apple"); System.out.println ("orange");
        System.out.println ("pear");

        if (num2 == MAX){
            System.out.println ("apple");
            System.out.println ("orange");
            }
            System.out.println ("pear");

            if (num3-num2 > 2*MAX)
        System.out.println
        ("apple");
        else
        System.out.println ("orange");

        if (LIMIT+num3 <= 150){
            System.out.println ("apple");
            System.out.println ("orange");
            }
            else
            System.out.println ("pear");

            if (2*num1 != num2)
        System.out.println ("apple");
        else{
        System.out.println ("orange");
        System.out.println ("pear");
        }

        if (LIMIT%num1 + 4 == num1 + (MAX-num2)){
            System.out.println ("apple");
            System.out.println ("orange");
            }
        else{
            System.out.println ("pear");
            System.out.println ("banana");
            }

        if (num1 < MAX)
        if (LIMIT >= num2)
        System.out.println ("apple");
        System.out.println ("orange");

        if (LIMIT <= LIMIT)
        if (num3 == num1)
        System.out.println ("apple");
        System.out.println ("orange");

        if (num2 > 18)
        if (num1 < 0)
        System.out.println ("apple");
        else
        System.out.println ("orange");
        System.out.println ("pear");
    }  

}
