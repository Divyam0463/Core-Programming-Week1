import java.util.Scanner;

public class StudentGrades_1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents * 3]; // 1D array for all students' marks
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            int totalMarks = 0; 
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Subject " + (j + 1) + " marks: ");
                    int index = i * 3 + j; //0,1,2 for 1st student and so on...
                    marks[index] = scanner.nextInt();
                    if (marks[index] < 0) {
                        System.out.println("Marks cannot be negative. Please enter again.");
                    }
                } while (marks[i * 3 + j] < 0);
                

                totalMarks += marks[i * 3 + j]; 
            }

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
                    "Physics: " + marks[i * 3] + ", " +
                    "Chemistry: " + marks[i * 3 + 1] + ", " +
                    "Maths: " + marks[i * 3 + 2] + ", " +
                    "Percentage: " + percentages[i] + ", " +
                    "Grade: " + grades[i]);
        }

    }
}

