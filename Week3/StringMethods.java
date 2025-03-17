package Week3; 

public class StringMethods {
    public static void main(String[] args) {
       
        String sentence = "I am a student of RMIT!";

        
        System.out.println("Original sentence: " + sentence);
        System.out.println("Character at index 5: " + sentence.charAt(5));
        System.out.println("Concatenation: " + sentence.concat(" Welcome!"));
        System.out.println("Ends with '!': " + sentence.endsWith("!"));
        System.out.println("Equals 'I am a student of RMIT!': " + sentence.equals("I am a student of RMIT!"));
        System.out.println("EqualsIgnoreCase 'i am a student of rmit!': " + sentence.equalsIgnoreCase("i am a student of rmit!"));
        System.out.println("Length of the sentence: " + sentence.length());
        System.out.println("Replacing 'RMIT' with 'University': " + sentence.replace("RMIT", "University"));
        System.out.println("Starts with 'I am': " + sentence.startsWith("I am"));
        System.out.println("Uppercase version: " + sentence.toUpperCase());
    }
}