/*1 star
 (Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
Here is a sample run:
 */

package week02.chapter07;

import java.util.Scanner;

public class AssignGrades7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents;
        System.out.println("Enter the number of students: ");
        numberOfStudents = sc.nextInt();
        //Scores
        int best = 0;
        int scores[] = new int[numberOfStudents];
        //get the student scores
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the student " + (i + 1) + " score: ");
            scores[i] = sc.nextInt();
            //Save the best score
            if (best < scores[i]) {
                best = scores[i];
            }
        }
        //Display the grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("The student " + (i + 1) + " has a grade of: " + grade(scores[i], best));
        }
    }

    //I had a problem when displaying the grades, solved it like this
    public static String grade(int scores, int best) {
        if (scores >= best - 5) {
            return "A";
        } else if (scores >= best - 10) {
            return "B";
        } else if (scores >= best - 15) {
            return "C";
        } else if (scores >= best - 20) {
            return "D";
        } else {
            return "F";
        }
    }
}

