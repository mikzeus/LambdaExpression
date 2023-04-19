package day14_loops;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i < 1) {// bu loop da body nin çalışmması mümkün(zero execution is posible)
            System.out.println("while loop");
            i++;
        }
        // do-while loop
        int k = 1;
        do {
            System.out.println("do while loop");
            k++;
        } while (k < 1);

        // kullanıcı bir sayı girsin, sayı 100 den küçük ise kullanıcı "Kazandınız" mesajı alsın
        // diger durumlarda "Kaybettiniz" mesajı alsın

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Enter an integer");
            int n = scan.nextInt();

            if (n < 100) {

                System.out.println("Kazandiniz");
            } else {
                System.out.println("Kaybettiniz");
                break;
            }
        } while (true);

        System.out.println("Oyun Bitti");

        // kullanıcıdan alınan bi cümlenin büyük harfle başlayıp nokta
        // ile bittiğini kontrol eden kodu yazınız.

        do {
            System.out.println("pls enter a sentence");
            String s = scan.next();

            if (s.endsWith(".") && (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')) {
                System.out.println("Your sentence is correct grammatically");
            } else {
                System.out.println("Your sentence has grammatical mistake");
                break;
            }
        } while (true);
    }
}


