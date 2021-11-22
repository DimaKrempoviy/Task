import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner ones = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = ones.nextInt();
        Scanner two = new Scanner(System.in);
        System.out.println("Введите второе число ");
        int y = two.nextInt();
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int divider = x / y;
        int mod = x % y;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(divider);
        System.out.println(mod);
    }
}

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
 */