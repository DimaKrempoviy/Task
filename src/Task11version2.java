import java.util.Scanner;

public class Task11version2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = i.nextDouble();
        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter =  " + perimeter);
    }
    public static double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static double calculatePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
}