import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = key.nextInt();
        System.out.print("Enter second number: ");
        b = key.nextInt();
        System.out.println("The product of " + a + " and "
                + b + " is: " + multiRec(a, b));

    }

    public static int multiRec(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            if (a == 1) {
                return b;
            } else {
                return a + (multiRec(a, b - 1));
            }
        }

    }

}