import java.util.Scanner;

public class MaxOfThree {

    public static int[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close(); 
        return nums;
    }

    public static int findMax(int[] nums) {
        int max = nums[0]; // first number is the max initially
        for (int i = 1; i < 3; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = getInputs();
        int maximum = findMax(numbers);
        displayResult(maximum);
    }
}