package second;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();

        getDigits(number);
    }

    private static void getDigits(int number) {
        int temp = number;
        int power;
        int digit;
        int index = 0;
        int[] powerArray = new int[findDecimalNumber(number)];

        while (temp > 0) {
            digit = temp % 10;
            power = (int) Math.pow(digit, 2);
            powerArray[index] = power;
            index++;
            temp /= 10;
        }

        powerArray = reverseArray(powerArray);

        for (int p : powerArray) {
            System.out.print(p + ", ");
        }
    }

    private static int[] reverseArray(int[] powerArray) {
        int[] newArray = new int[powerArray.length];
        int index = 0;

        for (int i = powerArray.length - 1; i >= 0; i--) {
            newArray[index] = powerArray[i];
            index++;
        }

        return newArray;
    }

    private static int findDecimalNumber(int number) {
        int counter = 0;

        while (number > 0) {
            counter++;
            number /= 10;
        }

        return counter;
    }
}
