package first;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int k = j+1; k < array.length; k++) {
                if (array[k] < array[j]) {
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }

        for (int x: array) {
            System.out.println(x);
        }
    }
}
