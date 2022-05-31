package first;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Aradığınız harf topluluğunu giriniz(2 harf): ");
        String letterGroup = scan.nextLine();

        System.out.println("bir cümle giriniz: ");
        String message = scan.nextLine();
        char[] messageArray = message.toCharArray();

        for (int i = 0; i < message.length() - 1; i++) {
            if (letterGroup.charAt(0) == messageArray[i]) {
                if (letterGroup.charAt(1) == messageArray[i+1]) {
                    counter++;
                }
            }
        }

        System.out.println("girdiginiz cümlede " + letterGroup + " harf toplulugundan " + counter + " adet vardır");
    }
}
