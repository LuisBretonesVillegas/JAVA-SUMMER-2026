package Semana_1.tema_2;
import java.util.Scanner;
public class Ejercicio2_14 {
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
        double bmi = kilograms/(Math.pow(centimeters, 2));

        System.out.println("BMI is: " + bmi);
    }
}
