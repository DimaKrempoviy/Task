import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = i.nextDouble();

        System.out.println("Enter the height: ");
        double height = i.nextDouble();

        double area = calculateArea(width, height);
        double perimeter = calculatePerimeter(width, height);

        System.out.println("Area = " + area);
        System.out.println("Perimeter =  " + perimeter);
    }
    public static double calculateArea(double width, double height){
        return width * height;
    }
    public static double calculatePerimeter(double width, double height){
        return 2 * (width + height);
    }
}

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 */
