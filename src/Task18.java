import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first binary number");
        String first = scanner.nextLine();

        System.out.println("Please enter second binary number");
        String second = scanner.nextLine();

        String multiplication = add(first, second);
        System.out.println("Multiplication of two binary numbers : " + multiplication);


    }

    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int dob = b1 * b2;
        return Integer.toBinaryString(dob);

    }
}
