import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " "); // Print the first two terms

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
          printFibonacci(n);
        }
        scanner.close();
    }
}