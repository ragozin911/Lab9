package Lr09;

import java.util.Scanner;

public class Example4 {

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        System.out.println("Факториал = " + factorial(n));

        scanner.close();
    }
}