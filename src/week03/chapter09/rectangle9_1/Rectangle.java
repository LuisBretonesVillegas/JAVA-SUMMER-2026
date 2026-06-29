package week03.chapter09.rectangle9_1;

/*
Exercise 9.1 (The Rectangle class)
Following the example of the Circle class, this class represents a rectangle
defined by its width and height.

UML:
+---------------------------------------+
|              Rectangle                |
+---------------------------------------+
| - width: double                       |
| - height: double                      |
+---------------------------------------+
| + Rectangle()                         |
| + Rectangle(width: double,            |
|             height: double)           |
| + getWidth(): double                  |
| + getHeight(): double                 |
| + getArea(): double                   |
| + getPerimeter(): double              |
+---------------------------------------+
 */
public class Rectangle {
    private double width;
    private double height;

    // No-arg constructor: creates a default rectangle (width = 1, height = 1)
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor that creates a rectangle with the specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Returns the area of this rectangle
    public double getArea() {
        return width * height;
    }

    // Returns the perimeter of this rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
