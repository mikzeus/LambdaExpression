package day04_practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C01_Proje {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 'a' veya 'c' içeren bir kelime giriniz... ");
        String sentence = scan.nextLine().toLowerCase();

        // I.Way
        int count = 0;
        for (int i = 0; i < sentence.indexOf('c'); i++) {
            if (sentence.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("c den önce " + count + " 'a' vardır");

        System.out.println("-------------------------------");

        // II.Way
        int sayac = 0;
        if (sentence.contains("c") && sentence.contains("a")) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a') {
                    sayac++;
                } else if (sentence.charAt(i) == 'c') {
                    break;
                }

            }
            System.out.println("C'den onceki a sayisi :" + sayac);

        } else {
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");
        }


    }
}
