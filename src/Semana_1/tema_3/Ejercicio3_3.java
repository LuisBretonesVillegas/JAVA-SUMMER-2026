package Semana_1.tema_3;

import java.util.Scanner;

public class Ejercicio3_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        System.out.println("Enter d: ");
        d = sc.nextDouble();
        System.out.println("Enter e: ");
        e = sc.nextDouble();
        System.out.println("Enter f: ");
        f = sc.nextDouble();

        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x is " + x + " and y is " + y);

    }
}

