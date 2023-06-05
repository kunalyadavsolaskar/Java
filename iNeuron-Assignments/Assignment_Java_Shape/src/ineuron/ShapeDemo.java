//Write a Java program that uses polymorphism by defining an interface called Shape
//with methods to calculate the area and perimeter of a shape. Then create classes
//that implement the Shape interface for different types of shapes, such as circles and
//triangles.

package ineuron;

public class ShapeDemo {
    public static void main(String[] args) {
        
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
