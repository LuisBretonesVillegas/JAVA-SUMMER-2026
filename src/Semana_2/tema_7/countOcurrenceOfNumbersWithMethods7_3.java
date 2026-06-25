/*2 stars
Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.
 */
package Semana_2.tema_7;

import java.util.Scanner;

//Don't forget to call the methods in main (int length...) without it the program just doesn't work
public class countOcurrenceOfNumbersWithMethods7_3 {
    static void main(String[] args) {
        int[] scores = new int[100];
        System.out.println("Write the scores of your students (prompt a negative number to finish the program).");
        int length = getScores(scores);
        int average = getAverage(length, scores);
        clasiffyScores(length, scores, average);
    }

    //gets the scores of the students
    static int getScores(int[] scores) {
        int length = 0;
        int best = 0, worst = 100;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {

            System.out.println("The score of the student " + (i + 1) + " is: ");
            scores[i] = sc.nextInt();
            if (scores[i] < 0) break;
            if (scores[i] > 100) {
                scores[i] = 100;
            }
            //safe the best score
            if (scores[i] > best) {
                best = scores[i];
            }
            //safe the worst score
            if (scores[i] < worst) {
                worst = scores[i];
            }
            length++;
        }
        return length;
    }

    // Returns the average score
    public static int getAverage(int length, int scores[]) {
        int summatory = 0;
        for (int i = 0; i < length; i++) {
            summatory += scores[i];
        }
        int average = summatory / length;
        return average;
    }

    //Clasifies scores and prints in console if the student is above, equal or below average
    public static void clasiffyScores(int length, int scores[], int average) {
        for (int i = 0; i < length; i++) {
            if (scores[i] > average) {
                System.out.println("The student " + (i + 1) + " is above average.");
            } else if (scores[i] == average) {
                System.out.println("The student " + (i + 1) + " is average.");
            } else System.out.println("The student " + (i + 1) + " is under average.");
        }
    }
}