package week01.chapter01;

//Pint the following table:
public class Ejercicio1_4 {
    static void main() {
        System.out.println("a\ta²\ta³\ta⁴");
        for (int a = 1; a < 5; a++) {
            int square = (int) Math.pow(a, 2);
            int cubic = (int) Math.pow(a, 3);
            int cuadratic = (int) Math.pow(a, 4);
            System.out.println(a + "\t" + square + "\t" + cubic + "\t" + cuadratic + "\t");
        }
    }
}
