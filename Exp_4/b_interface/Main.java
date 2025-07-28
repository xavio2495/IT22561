interface Shape {
    void draw();
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating Interface Implementation (Shape, Circle, Rectangle):\n");
        Circle myCircle = new Circle(10.0);
        Rectangle myRectangle = new Rectangle(5.0, 8.0);

        Shape shape1 = myCircle;
        System.out.print("Using shape1 (a Circle): ");
        shape1.draw();
        Shape shape2 = myRectangle;
        System.out.print("Using shape2 (a Rectangle): ");
        shape2.draw();

        System.out.println("\nDirectly calling draw() on objects:");
        myCircle.draw();
        myRectangle.draw();
    }
}