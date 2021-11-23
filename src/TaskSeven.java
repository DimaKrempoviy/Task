import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner ones = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int x = ones.nextInt();

        for (int i=0; i <=10; i++){
            System.out.println(x * i);
        }
    }
}

/*
Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
 */