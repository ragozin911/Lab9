package Lr09;

import java.util.Scanner;

public class Example8_B {

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public void createHeadRec(int[] values) {
        head = null;
        createHeadRec(values, 0);
    }

    private void createHeadRec(int[] values, int index) {
        if (index >= values.length) {
            return;
        }

        head = new Node(values[index], head);

        createHeadRec(values, index + 1);
    }

    public void createTailRec(int[] values) {
        head = null;
        createTailRec(values, 0);
    }

    private void createTailRec(int[] values, int index) {
        if (index >= values.length) {
            return;
        }

        addLast(values[index]);

        createTailRec(values, index + 1);
    }

    private void addLast(int value) {

        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node ref = head;

        while (ref.next != null) {
            ref = ref.next;
        }

        ref.next = newNode;
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {

        if (node == null) {
            return "";
        }

        return node.value + " " + toStringRec(node.next);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Example8_B list = new Example8_B();

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Введите элементы списка:");

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        list.createTailRec(values);

        System.out.println("Рекурсивный список:");
        System.out.println(list.toStringRec());

        scanner.close();
    }
}