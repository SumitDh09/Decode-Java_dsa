package module10;
import java.util.Scanner;

public class Rectangle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        double perimeter = 2.0 * (length + breadth);
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else {
            System.out.println("The area of the rectangle is not greater than its perimeter.");
        }

        scanner.close();
    }
}
