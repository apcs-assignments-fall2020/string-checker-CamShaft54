import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        // REPLACE WITH YOUR CODE
        return (str.length() - str.replace("a", "").length()) + (str.length() - str.replace("b", "").length()) + (str.length() - str.replace("c", "").length());
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        // REPLACE WITH YOUR CODE
        return str.toUpperCase().contains("THE");
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        // REPLACE WITH YOUR CODE
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose mode (countABC, containsThe, isPalindrome): ");
        String menu = scan.next();
        System.out.println("Enter String: ");
        String str = scan.next();
        switch (menu.toUpperCase()) {
            case "COUNTABC":
                System.out.println("countABC:\nInput: " + str + "\nOutput: " + countABC(str));
                break;
            case "CONTAINSTHE":
                System.out.println("containsThe:\nInput: " + str + "\nOutput: " + containsThe(str));
                break;
            case "ISPALINDROME":
                System.out.println("isPalindrome:\nInput: " + str + "\nOutput: " + isPalindrome(str));
                break;
            default:
                System.out.println("Invalid Arguments.");
        }
    }
}
