import java.util.Scanner;

public class FactorialRecursive {

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close(); 
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Indicate an error for negative input
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayResult(int num, long factorial) {
        if (factorial == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }

    public static void main(String[] args) {
        int number = getNumber();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }
}