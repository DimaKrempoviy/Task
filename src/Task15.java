import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner i = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = i.nextDouble();

        System.out.println("Enter the num2: ");
        int num2 = i.nextDouble();

        System.out.println();

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;



    }
}
