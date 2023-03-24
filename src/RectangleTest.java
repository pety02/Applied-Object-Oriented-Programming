import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.print("Enter color: ");
        String color = input.next();
        
        Rectangle rectangle = new Rectangle(width, height);
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());
        System.out.printf("Area: %.2f%n", rectangle.getArea());
    }
}