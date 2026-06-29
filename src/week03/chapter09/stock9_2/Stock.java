/*
Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
 */
package week03.chapter09.stock9_2;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock() {
        symbol = null;
        name = null;
    }

    //Constructor that creates a stock
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    //Method that returns the percentage changed from preciousClosingPrice to currentPrice
    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
