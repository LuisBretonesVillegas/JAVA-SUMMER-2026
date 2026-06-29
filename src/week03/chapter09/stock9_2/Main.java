/*
Write a test pro-
gram that creates a Stock object with the stock symbol ORCL, the name Oracle
Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage.
 */
package week03.chapter09.stock9_2;

public class Main {
    public static void main(String[] args) {
        double percentajeDifference;
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        percentajeDifference = stock1.getChangePercent(34.5, 34.35);
        System.out.println("The price-change percentaje is " + percentajeDifference);
    }
}
