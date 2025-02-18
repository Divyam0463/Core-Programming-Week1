import java.text.DecimalFormat;
import java.util.Random; 

public class Zara_arr_random_methods {

    public static void main(String[] args) {
        double[][] old = generateEmployeeData();
        double[][] ans = calculateBonus(old);
        displaySalarySummary(old, ans);
    }

    static double[][] generateEmployeeData() {
        double[][] old = new double[10][2]; // 10 employees
        Random random = new Random();

        for (int i = 0; i < old.length; i++) {
            old[i][0] = (10000 + random.nextInt(90000)); // Salary between 10000 and 99999
            old[i][1] = (1 + random.nextInt(10));        // Years between 1 and 10
        }
        return old;
    }

    static double[][] calculateBonus(double[][] old) {
        double[][] ans = new double[10][2]; // 10 employees
        for (int i = 0; i < old.length; i++) {
            if (old[i][1] > 5) {
                ans[i][0] = old[i][0] + (0.05) * old[i][0]; // 5% bonus
            } else if (old[i][1] > 0 && old[i][1] <= 5) {
                ans[i][0] = old[i][0] + (0.02) * old[i][0]; // 2% bonus
            }
            ans[i][1] = ans[i][0] - old[i][0]; // Bonus amount
        }
        return ans;
    }

    static void displaySalarySummary(double[][] old, double[][] ans) {
        DecimalFormat df = new DecimalFormat("0.0"); // Format to currency
        double sumOld = 0;
        double sumNew = 0;
        double bonus = 0;

        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years Served", "Bonus Amount", "New Salary");
        System.out.println("------------------------------------------------------------------");


        for (int i = 0; i < ans.length; i++) {
            System.out.printf("%-10d %-15s %-15.1f %-15s %-15s\n", i + 1, df.format(old[i][0]), old[i][1], df.format(ans[i][1]), df.format(ans[i][0]));
            bonus += ans[i][1];
            sumOld += old[i][0];
            sumNew += ans[i][0];
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Total", df.format(sumOld), "", df.format(bonus), df.format(sumNew));
        System.out.println("------------------------------------------------------------------");
    }
}