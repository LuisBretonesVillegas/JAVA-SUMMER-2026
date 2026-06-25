
        /*A pentagonal number is defined as n(3n-1)/2 for n=1,2,3... The first few numbers are 1, 5, 12, 22
         *   write a method with the following header that returns a pentagonal number:
         */

        package Semana_2.tema_6;

        public class mathPentagonalNumbers6_1 {
            static void main(String[] args) {
                for (int n = 1; n < 101; n++) {
                    System.out.println("The 100 first pentagonal numbers are: " + getPentagonalNumber(n));
                }
            }

            public static int getPentagonalNumber(int n) {
                return n * (3 * n - 1) / 2;
            }
        }
