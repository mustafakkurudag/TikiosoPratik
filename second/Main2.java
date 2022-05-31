package second;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Lütfen bir sayı giriniz: ");
        number = scanner.nextInt();

        isArmstrong(number);

    }

    private static void isArmstrong(int number) {
        int sum = 0;
        int digit = findDecimalNumber(number);
        int temp = number;
        int digitValue;

        while (temp > 0) {
            digitValue = temp % 10;
            sum += Math.pow(digitValue, digit);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " bir armstrong sayıdır.");
        } else {
            System.out.println(number + " bir armstrong sayı değildir.");
        }
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
