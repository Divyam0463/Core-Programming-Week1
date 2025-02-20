import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
  static double[][] calculateResults(int [][]marks) {
    double [][]results = new double[marks.length][3]; // Total, Avg, Percentage, Grade (later)

    for (int i = 0; i < marks.length; i++) {
        int total = 0;
        for (int j = 0; j < 3; j++) {
            total += marks[i][j];
        }
        double average = (double) total / 3;
        double percentage = (double) total / 300 * 100; // Assuming each subject is out of 100

        results[i][0] = Math.round(total * 100.0) / 100.0;       // Round to 2 decimal places
        results[i][1] = Math.round(average * 100.0) / 100.0;     // Round to 2 decimal places
        results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Round to 2 decimal places
    }
    return results;
}
  static String[][] assignGrades(double[][] results) {
    String[][] grades = new String[results.length][2]; // Grade and Remarks
    for (int i = 0; i < results.length; i++) {
        double percentage = results[i][2];
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }
        grades[i][0] = grade;
        grades[i][1] = remarks; // Store remarks as well
    }
    return grades;
}

static void displayScorecard(int[][] marks, double[][] results, String[][] grades, String[] subjects) {
  System.out.println("\n--- Student Scorecard ---") ;
  System.out.print("Student\t") ;
  for (String subject : subjects) {
      System.out.print(subject + "\t");
  }
  System.out.println("Total\tAverage\tPercentage\tGrade");

  for (int i = 0; i < marks.length; i++) {
      System.out.print((i + 1) + "\t"); // Student number
      for (int j = 0; j < 3; j++) {
          System.out.print(marks[i][j] + "\t"); // Marks
      }
      System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i][0] + " " + grades[i][1] + "\n");
  }
}
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;
    int students = s.nextInt() ;
    Random random = new Random() ;

    int [][] marks = new int[students][3] ;
    String [] subjects = {"physics", "chemistry","maths"} ; 

    for (int i = 0; i < marks.length; i++) {
      System.out.print("marks for " + (i+1)+": ") ;
      for (int j = 0; j < 3; j++) { 
        marks[i][j] = random.nextInt(100) ; 
        System.out.print(subjects[j]+" "+(i+1)+": "+marks[i][j]+" ") ;
      }System.out.println();
    }
    s.close(); 

    double[][] results = calculateResults(marks);
    String[][] grades = assignGrades(results); // Now includes Remarks

    displayScorecard(marks, results, grades, subjects);
  }
}
