package week01.chapter03;

import java.util.Scanner;

public class Ejercicio3_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;

        //Introduce data
        System.out.println("Introduce your weight in pounds: ");
        weight = sc.nextDouble();
        System.out.println("Introduce your height in inches: ");
        height = sc.nextDouble();

        //Calculate kilograms
        double kilograms = weight * 0.45359237;
        //Calculate cm
        double centimeters = height * 0.0254;

        //double BMI
        double bmi = kilograms / (Math.pow(centimeters, 2));

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
