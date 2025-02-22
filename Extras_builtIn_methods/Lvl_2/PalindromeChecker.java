import java.util.Scanner;

public class PalindromeChecker {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); 
        
        return input.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); //Remove non-alphanumeric and convert to lowercase
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String inputString = getInput();
        boolean palindrome = isPalindrome(inputString);
        displayResult(inputString, palindrome);
    }
}
