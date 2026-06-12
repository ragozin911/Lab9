package Lr09;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Example5_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение: ");
            map.put(i, scanner.nextLine());
        }
        System.out.println("\nСодержимое TreeMap:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nПервый ключ: " + map.firstKey());

        System.out.println("Последний ключ: " + map.lastKey());

        scanner.close();
    }
}