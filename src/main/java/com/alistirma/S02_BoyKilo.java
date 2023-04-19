package com.alistirma;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.math.MathContext;

public class S02_BoyKilo {
    public static void main(String[] args) {
 /*
        Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         INFO : BMI = kilo(kg) /(boy*boy)(m)
                BMI <=20 oldukca zayifsiniz
                20<BMI<=25 Normal sinirlardasiniz
                25<BMI<=30 Sisman kategorisindesiniz
                30<BMI ==> Obez grubundasiniz.

  */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen boyunuzu giriniz: ");
        double boy = scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz: ");
        double kilo = scan.nextDouble();
        double BMI = kilo / (boy * boy);

        if (BMI <= 20) {
            System.out.println("Oldukca Zayifsiniz...");
        } else if (20 < BMI && BMI <= 25) {
            System.out.println("Normal sinirlardasiniz..");
        } else if (25 < BMI && BMI <= 30) {
            System.out.println("Sisman kategorisindesiniz..");
        } else if (30 < BMI) {
            System.out.println("Obez grubundasiniz...");
        } else System.out.println("lutfen tamsayi bir deger giriniz...");

    }
}
