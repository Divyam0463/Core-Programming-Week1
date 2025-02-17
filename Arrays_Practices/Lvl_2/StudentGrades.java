import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Subject " + (j + 1) + " marks: ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter again.");
                    }
                } while (marks[i][j] < 0);
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nMarks, Percentages, and Grades of Students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " +
                    "Physics: " + marks[i][0] + ", " +
                    "Chemistry: " + marks[i][1] + ", " +
                    "Maths: " + marks[i][2] + ", " +
                    "Percentage: " + percentages[i] + ", " +
                    "Grade: " + grades[i]);
        }
    }
}
