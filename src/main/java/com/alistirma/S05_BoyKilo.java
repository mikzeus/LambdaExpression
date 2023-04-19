package com.alistirma;

import java.util.Scanner;

public class S05_BoyKilo {
    public static void main(String[] args) {
/*

        Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi ve kilonuzu giriniz:");
        int yas = scan.nextInt();
        int kilo= scan.nextInt();
         String yap =yas<18?"Kan Bagisi Yapamaz":yas>18 && kilo<50? "Kan Bagisi Yapamaz":yas>18 && kilo>50 ?
                 "Kan Bagisi yapar":"Kan Bagisi Yapamaz";

        System.out.println(yap);

        if (yas<18){
            System.out.println("Kan Bagisi Yapamaz");
        }else if (kilo<50 && 18<yas){
            System.out.println("Kan Bagisi Yapamaz");
        }else if (yas>18 && kilo>50){
            System.out.println("Kan Bagisi Yapabilir");
        }else System.out.println("lutfen girilen degerleri kontrol ediniz..");


    }
}
