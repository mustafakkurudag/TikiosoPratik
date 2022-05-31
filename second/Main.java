package second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        char ch;

        System.out.println("Cümle giriniz: ");
        message = scan.nextLine();
        System.out.println("Aradığınız harfi giriniz(küçük harf): ");
        ch = scan.next().toLowerCase().charAt(0);

        findHowManyCase(message, ch);
    }

    static void findHowManyCase(String message, char ch) {
        char[] messageArray = message.toLowerCase().toCharArray();
        int counter = 0;

        for (char c : messageArray) {
            if (c == ch) {
                counter++;
            }
        }

        System.out.println("Girdiğiniz cümlede '" + ch + "' harfinden " + counter + " adet vardır");
    }
}
