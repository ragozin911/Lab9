
   package Lr09;
import java.util.Scanner;

    public class Example3 {
        static void inputArray(int[] arr, int index, Scanner sc) {

            if (index == arr.length) {
                return;
            }

            System.out.print("Введите элемент [" + index + "]: ");

            arr[index] = sc.nextInt();
            inputArray(arr, index + 1, sc);
        }

        static void printArray(int[] arr, int index) {

            if (index == arr.length) {

                return;

            }
            System.out.print(arr[index] + " ");

            printArray(arr, index + 1);

        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Введите размер массива: ");

            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Введите элементы массива:");

            inputArray(array, 0, sc);

            System.out.println("\nМассив:");

            printArray(array, 0);

        }

    }

