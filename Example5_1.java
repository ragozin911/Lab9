package Lr09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение: ");
            map.put(i, scanner.nextLine());
        }

        System.out.println("\nСодержимое HashMap:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nКоличество элементов: " + map.size());

        System.out.println("Значение по ключу 0: " + map.get(0));

        System.out.println("Содержит ключ 1: " + map.containsKey(1));

        System.out.println("Содержит значение Java: "
                + map.containsValue("Java"));

        if (map.containsKey(0)) {
            map.remove(0);
        }

        System.out.println("\nПосле удаления ключа 0:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}