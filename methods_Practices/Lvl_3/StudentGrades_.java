import java.util.Scanner;

public class StudentGrades_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        String[] names = new String[numStudents];
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        int[] totalMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.next();
            System.out.print("Physics marks: ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Chemistry marks: ");
            chemistryMarks[i] = scanner.nextInt();
            System.out.print("Math marks: ");
            mathMarks[i] = scanner.nextInt();
            
            totalMarks[i] = physicsMarks[i] + chemistryMarks[i] + mathMarks[i];
            percentages[i] = (totalMarks[i] / 3.0);
            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'E';
            }
        }
        
        System.out.println("\nStudent Grades:");
        System.out.println("Name\tTotal Marks\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + "\t" + totalMarks[i] + "\t\t" + percentages[i] + "\t\t" + grades[i]);
        }
        
        scanner.close();
    }
}