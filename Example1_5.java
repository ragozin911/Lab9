package Lr09;

import java.util.Scanner;
public class Example1_5 {

    public static int fibonacci(int n) {

        System.out.println("Вызов fibonacci(" + n + ")");

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер числа Фибоначчи: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);

        System.out.println("Число Фибоначчи = " + result);

        scanner.close();
    }
}