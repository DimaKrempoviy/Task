import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = i.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        double Perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter: " + Perimeter);
    }
}


/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
 */