import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine().toLowerCase(); 

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (Character.isLetter(ch)) { // Check if it's a letter (important!)
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        sc.close();
    }

    // Helper function to check vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; // to check for vowels
    }
}