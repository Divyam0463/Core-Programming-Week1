import java.util.Scanner;

class BMI_arrays_1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[] data = new double[n * 2];  // 2 values (weight and height) for each person

        for (int i = 0; i < n; i++) {
            System.out.println("Input the weight for person " + (i + 1) + " (in kgs):");
            data[i * 2] = s.nextDouble();  // weight at index 0, 2, 4, etc.

            System.out.println("Input the height for person " + (i + 1) + " (in cm):");
            data[i * 2 + 1] = s.nextDouble();  // height at index 1, 3, 5, etc.
        }

        
        String[] BMIs = new String[n];
        String[] categories = new String[n];

       
        for (int i = 0; i < n; i++) {
            double weight = data[i * 2];  // Get the weight for person i
            double height = data[i * 2 + 1];  // Get the height for person i

            double heightMeters = height / 100.0;
            double BMI = weight / (heightMeters * heightMeters);

            // Format the BMI and categorize
            BMIs[i] = String.format("%.1f", BMI);

            if (BMI <= 18.4) {
                categories[i] = "Underweight";
            } else if (BMI >= 18.5 || BMI <= 24.9) {
                categories[i] = "Normal";
            } else if (BMI >= 25.0 || BMI <= 39.9) {
                categories[i] = "Overweight";
            } else if(BMI>=40.0) {
                categories[i] = "Obese";
            }
        }

        // Output 
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": BMI = " + BMIs[i] + ", Category = " + categories[i]);
        }

        s.close();
    }
}

