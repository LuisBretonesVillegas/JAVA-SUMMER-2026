package week03.chapter09.rectangle9_1;

/*0 stars
Creates two Rectangle objects (4 by 40 and 3.5 by 35.9) and displays the
width, height, area and perimeter of each one, in this order.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        printRectangle(rectangle1);
        printRectangle(rectangle2);
    }

    // Displays the data of a rectangle in the requested order
    private static void printRectangle(Rectangle rectangle) {
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
    }
}
