package Lr09;
public class Example1_3 {

    public static void m(int x) {
        System.out.println("До рекурсии: " + x);

        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }

        System.out.println("После рекурсии: " + x);
    }

    public static void main(String[] args) {
        m(1);
    }
}