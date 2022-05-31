package first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int[] odds = new int[10];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input new number: ");
            array[i] = scanner.nextInt();
            if (array[i] % 2 != 0) {
                odds[index] = array[i];
                index++;
            }
        }

        System.out.println("New odd array: ");
        for (int x = 0; x < index; x++) {
            System.out.print(odds[x] + ", ");
        }
    }
}
