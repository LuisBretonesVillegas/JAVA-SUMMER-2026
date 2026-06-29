package week03.chapter09.polygon9_9;

public class RegularPolygon {

    private final double PI = 3.1415;
    private int n = 3; //Stores side
    private double side = 1.0; //Stores length
    private double x = 0.0; //Stores the x cordinate
    private double y = 0.0; //Stores the y cordinate

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //Accesors
    public int getN() {
        return n;
    }

    //Mutators
    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    //returns the perimeter
    public double getPerimeter() {
        return n * side;
    }

    //returns the area
    public double getArea() {
        return (n * (side * side)) / (4 * Math.tan(PI / n));
    }
}
