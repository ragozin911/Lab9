package Lr09;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Введите 10 строк:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            words.add(scanner.nextLine());
        }

        System.out.println("\nСтроки, у которых ключ > 5:");

        boolean longWordsFound = false;

        for (String word : words) {
            int key = word.length();

            if (key > 5) {
                System.out.println(word + " " + key );
                longWordsFound = true;
            }
        }

        if (!longWordsFound) {
            System.out.println("Отсутствуют");
        }

        System.out.println("\nСтроки, у которых ключ = 0:");

        boolean emptyFound = false;

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 0) {
                System.out.println("Пустая строка №" + (i + 1));
                emptyFound = true;
            }
        }

        if (!emptyFound) {
            System.out.println("Отсутствуют");
        }

        long product = 1;
        boolean found = false;

        for (String word : words) {
            int key = word.length();

            if (key > 5) {
                product *= key;
                found = true;
            }
        }

        if (found) {
            System.out.println("\nПроизведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("\nСтрок длиной больше 5 символов не найдено.");
        }

        scanner.close();
    }
}