package Lr09;

import java.util.Scanner;

public class Example8_A {

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public void createHead(int[] values) {
        head = null;

        for (int value : values) {
            head = new Node(value, head);
        }
    }

    public void createTail(int[] values) {
        head = null;

        for (int value : values) {
            AddLast(value);
        }
    }

    public void AddFirst(int value) {
        head = new Node(value, head);
    }

    public void AddLast(int value) {
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

    public void Insert(int index, int value) {
        if (index == 0) {
            AddFirst(value);
            return;
        }

        Node ref = head;

        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }

        if (ref != null) {
            ref.next = new Node(value, ref.next);
        }
    }

    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void RemoveLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node ref = head;

        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
    }

    public void Remove(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            RemoveFirst();
            return;
        }

        Node ref = head;

        for (int i = 0; i < index - 1 && ref.next != null; i++) {
            ref = ref.next;
        }

        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node ref = head;

        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Example8_A list = new Example8_A();

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Введите элементы списка:");

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        list.createTail(values);

        System.out.println("Исходный список: " + list);

        list.AddFirst(100);
        System.out.println("После AddFirst: " + list);

        list.AddLast(200);
        System.out.println("После AddLast: " + list);

        list.Insert(2, 300);
        System.out.println("После Insert: " + list);

        list.RemoveFirst();
        System.out.println("После RemoveFirst: " + list);

        list.RemoveLast();
        System.out.println("После RemoveLast: " + list);

        list.Remove(2);
        System.out.println("После Remove: " + list);

        scanner.close();
    }
}