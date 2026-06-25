/* 0 stars
Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.
 */
package Semana_2.tema_7;

import java.util.Scanner;

public class analyzeScores7_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[100];
        int best = 0, worst = 100;
        int length = 0;
        System.out.println("Write the scores of your students (prompt a negative number to finish the program).");
        //Get the students scores
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
        //Get if the student score is above or under average
        int summatory = 0;
        for (int i = 0; i < length; i++) {
            summatory += scores[i];
        }
        int average = summatory / length;
        for (int i = 0; i < length; i++) {
            if (scores[i] > average) {
                System.out.println("The student " + (i + 1) + " is above average.");
            } else if (scores[i] == average) {
                System.out.println("The student " + (i + 1) + " is average.");
            } else System.out.println("The student " + (i + 1) + " is under average.");
        }

    }
}
