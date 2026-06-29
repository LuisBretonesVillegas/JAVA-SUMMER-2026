package week02.chapter05;

import java.util.Scanner;

public class CaseStudyCheckingPalindromes {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Make a program that prompts the user to enter a string and reports whether the string is a palindrome or isn't.

        //Defining variables
        String word;
        String invertedWord = "";
        //Prompting user
        System.out.println("Enter the word you want to check: ");
        word = sc.nextLine();
        //Inverting the word
        for (int i = word.length() - 1; 0 <= i; i--) {

            char invetdedLetter = word.charAt(i);
            invertedWord += invetdedLetter;
        }
        //Program answers
        if (word.equalsIgnoreCase(invertedWord)) {
            System.out.println("The word is indeed, a palindrome.");
        } else {
            System.out.println("The word ain't nothing cuh.");
        }
    }
}
