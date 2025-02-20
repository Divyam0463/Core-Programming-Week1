import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    static int[] getAges(int numStudents) {
        int[] ages = new int[numStudents]; // array to store ages
        Scanner s = new Scanner(System.in); 
        Random random = new Random() ; 

        for (int i = 0; i < numStudents; i++) {
            ages[i] = random.nextInt(99) ;
        }
        s.close();
        return ages; 
    }

    //to check voting based on age
    static boolean[] checkVotingEligibility(int[] ages) {
        boolean[] eligibility = new boolean[ages.length]; // to store (true/false)

        for (int i = 0; i < ages.length; i++) {
            eligibility[i] = (ages[i] >= 18 && ages[i] >= 0); 
        }
        return eligibility; // Return the array of eligibility
    }

    public static void main(String[] args) {
        int numStudents = 10; 

        int[] ages = getAges(numStudents);

        // Check the voting eligibility
        boolean[] eligibility = checkVotingEligibility(ages);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Age " + ages[i] + ", Can Vote: " + eligibility[i]); 
        }
    }
}