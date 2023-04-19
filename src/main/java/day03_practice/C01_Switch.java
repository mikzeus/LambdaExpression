package day03_practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Score From 0 to 4 : ");
        double score = scan.nextDouble();

        String level = "";

        if (score >= 0 && score < 1) {
            level = "KALDI";
        } else if (score >= 1 && score < 2) {
            level = "GECTI";
        } else if (score >= 2 && score < 2.5) {
            level = "IYI";
        } else if (score >= 2.5 && score < 3.5) {
            level = "UST";
        } else if (score >= 3.5 && score <= 4) {
            level = "HARIKA";
        } else System.out.println("please check entering your score again");

        System.out.println(level);

        switch (level) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTI":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARIKA":
                System.out.println("A");
        }
    }
}
