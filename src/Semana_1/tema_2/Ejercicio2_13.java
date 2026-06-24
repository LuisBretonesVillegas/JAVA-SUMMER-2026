package Semana_1.tema_2;

import java.util.Scanner;

public class Ejercicio2_13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double annualInterest = 0.0375;
        final double monthlyInterest = annualInterest / 12;
        double monthlySavings;
        double monthlyProfit = 0; //The variable has to be inicialiced
        int months;
        System.out.println("Select how many money you want to save per month: ");
        monthlySavings = sc.nextDouble();
        System.out.println("Select how many money you will have in X months, select X: ");
        months = sc.nextInt();
        for (int i = 0; i < months; i++) {
            monthlyProfit += 100 * (1 + monthlyInterest);
            System.out.println("In the month " + (i + 1) + " you would have saved: " + monthlyProfit);
        }
    }
}
