import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = in.nextInt();

        System.out.println("Enter the second number: ");
        int y = in.nextInt();

        System.out.println("Enter the third number: ");
        int z = in.nextInt();

        System.out.println("average of the numbers " + (x + y + z) / 3);
    }
}

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */