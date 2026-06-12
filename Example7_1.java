package Lr09;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество человек: ");
        int n = scanner.nextInt();

        ArrayList<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;

        while (people.size() > 1) {
            index = (index + 1) % people.size();

            System.out.println("Вычеркнут человек № " + people.get(index));

            people.remove(index);
        }

        System.out.println("Остался человек № " + people.get(0));

        scanner.close();
    }
}