import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printIntructions();
        String input = bufferedReader.readLine();

        String newString = input.toUpperCase().toLowerCase().replace(" ", "");
        String newReversedString = Main.reverseString(newString);

        System.out.println("Your text is: " + newReversedString);

        if (newReversedString.equals(input.toUpperCase().toLowerCase())) {
            isPalindromeMessage();
            return;
        }
        isNotPalindromeMessage();
        return;
    }

    public static void printIntructions() {
        System.out.println("Type a palindrom.");
        System.out.println("(ex 'a roza upala na lapu azora')");
    }

   public static String reverseString(String newString){
        if (newString.length() <= 1) {
            return newString;
       }
        return (reverseString(newString.substring(1)) + newString.charAt(0));
   }

   public static void isPalindromeMessage() {
        System.out.println("Wow! It is a palindrome. Congrats!");
   }

   public static void isNotPalindromeMessage() {
        System.out.println("No, it is not a palindrome :(");
    }

}