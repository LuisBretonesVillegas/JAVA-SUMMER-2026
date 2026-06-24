package Semana_1.tema_2;

import java.util.Scanner;

public class Ejercicio2_16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anualInterestRate;
        int numberOfYears;
        double loanAmount;
        //must compute and display the monthly payment and total payment amounts.
        double monthlyPayment;
        double totalPayment;

        //User enters loan amount and years of payment
        System.out.println("Enter the loan amount in euros:");
        loanAmount = sc.nextDouble();
        System.out.println("Enter how many years of payment: ");
        numberOfYears = sc.nextInt();

        //Monthly interest rate
        System.out.println("Enter the annual interest rate: ");
        anualInterestRate = sc.nextDouble();
        double monthlyInterestRateDecimal = anualInterestRate / 1200;

        //Monthly payment calculations
        monthlyPayment = (loanAmount * monthlyInterestRateDecimal) / (1 - (1 / Math.pow((1 + monthlyInterestRateDecimal), (numberOfYears * 12))));

        //Total payment calculations
        totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is: " + monthlyPayment + "\nThe total payment is: " + totalPayment);
    }
}
