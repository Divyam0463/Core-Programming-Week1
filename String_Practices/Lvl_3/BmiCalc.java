import java.util.Scanner;

public class BmiCalc {

    static String[][] calculateBmiAndStatus(double[][] heightWeight) {
        String[][] results = new String[heightWeight.length][4]; // height, weight, BMI, status

        for (int i = 0; i < heightWeight.length; i++) {
            double heightMeters = heightWeight[i][1] / 100.0; // Convert cm to meters
            double bmi = heightWeight[i][0] / (heightMeters * heightMeters);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            results[i][0] = String.format("%.2f", heightWeight[i][1]); // Height (cm)
            results[i][1] = String.format("%.2f", heightWeight[i][0]); // Weight (kg)
            results[i][2] = String.format("%.2f", bmi);                // BMI
            results[i][3] = status;                                  // Status
        }
        return results;
    }

    static void displayResults(String[][] results) {
        System.out.println("------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s%-10s%-10s%-10s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] heightWeight = new double[10][2]; // 10 people, height and weight

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = s.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = s.nextDouble();
        }

        String[][] results = calculateBmiAndStatus(heightWeight);
        displayResults(results);

        s.close();
    }
}
