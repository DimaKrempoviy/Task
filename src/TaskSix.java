import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner ones = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = ones.nextInt();
        Scanner two = new Scanner(System.in);
        System.out.println("Введите второе число ");
        int y = two.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
 */