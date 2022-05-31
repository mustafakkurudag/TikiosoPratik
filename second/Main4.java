package second;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        String textOfNumber = "";

        System.out.print("Sayı giriniz: ");
        number = s.nextInt();

        int units = number % 10;
        int tenth = number / 10;

        switch (tenth) {
            case 1:
                textOfNumber += "on ";
                break;
            case 2:
                textOfNumber += "yirmi ";
                break;
            case 3:
                textOfNumber += "otuz ";
                break;
            case 4:
                textOfNumber += "kırk ";
                break;
            case 5:
                textOfNumber += "elli ";
                break;
            case 6:
                textOfNumber += "altmış ";
                break;
            case 7:
                textOfNumber += "yetmiş ";
                break;
            case 8:
                textOfNumber += "seksen ";
                break;
            case 9:
                textOfNumber += "doksan ";
                break;
            default:
                break;
        }

        switch (units) {
            case 1:
                textOfNumber += "bir";
                break;
            case 2:
                textOfNumber += "iki";
                break;
            case 3:
                textOfNumber += "üç";
                break;
            case 4:
                textOfNumber += "dört";
                break;
            case 5:
                textOfNumber += "beş";
                break;
            case 6:
                textOfNumber += "altı";
                break;
            case 7:
                textOfNumber += "yedi";
                break;
            case 8:
                textOfNumber += "sekiz";
                break;
            case 9:
                textOfNumber += "dokuz";
                break;
            default:
                break;
        }

        System.out.println(number + " sayısının yazılışı: '" + textOfNumber + "'dır");
    }
}
