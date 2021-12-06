import java.util.Scanner;
class Task15 {
    private static final Scanner input = new Scanner(System.in);
    private static final String BEFORE_REPLACEMENT = "First number is %.2f, second number is %.2f before replacement";
    private static final String AFTER_REPLACEMENT = "First number is %.2f, second number is %.2f after replacement";
    private static final String FIRST_NUMBER_REQUEST_MESSAGE = "Enter the first number:";
    private static final String SECOND_NUMBER_REQUEST_MESSAGE = "Enter the second number:";

    public static void main(String[] args) {
        double firstNumber = requestNumber(FIRST_NUMBER_REQUEST_MESSAGE);
        double secondNumber = requestNumber(SECOND_NUMBER_REQUEST_MESSAGE);

        System.out.printf(BEFORE_REPLACEMENT + System.lineSeparator(), firstNumber, secondNumber);

        Double[] numbers = {firstNumber, secondNumber};

        replace(numbers);

        firstNumber = numbers[0];
        secondNumber = numbers[1];

        System.out.printf(AFTER_REPLACEMENT + System.lineSeparator(), firstNumber, secondNumber);
    }

    static double requestNumber(String requestMessage) {
        System.out.println(requestMessage);
        return input.nextDouble();
    }

    static void replace(Double[] numbers) {
        numbers[0] += numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] -= numbers[1];
    }
}

/*
Write a Java program to swap two variables.
 */