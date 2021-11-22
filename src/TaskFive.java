import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner ones = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = ones.nextInt();
        Scanner two = new Scanner(System.in);
        System.out.println("Введите второе число ");
        int y = two.nextInt();
        int product = x * y;
        System.out.println(product);
    }
}

/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
 */
