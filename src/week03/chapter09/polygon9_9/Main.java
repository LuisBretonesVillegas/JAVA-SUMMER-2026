package week03.chapter09.polygon9_9;

public class Main {
    static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The first polygon perimeter is: " + polygon1.getPerimeter());
        System.out.println("The first polygon area is: " + polygon1.getArea());
        System.out.println("The second polygon perimeter is: " + polygon2.getPerimeter());
        System.out.println("The second polygon area is: " + polygon2.getArea());
        System.out.println("The third polygon perimeter is: " + polygon3.getPerimeter());
        System.out.println("The third polygon area is: " + polygon3.getArea());
    }
}
