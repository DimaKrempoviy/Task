import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        double num1 = i.nextDouble();

        System.out.println("Enter the num2: ");
        double num2 = i.nextDouble();

        System.out.println("num1 = " + num1 + ", " + "num2 = "+  num2 + " before replacement");

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1 + ", " + "num2 = " + num2 + " after replacement");


    }
}

/*
Write a Java program to swap two variables.
 */