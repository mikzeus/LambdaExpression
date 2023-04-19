package com.alistirma;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class S07_BuyukKucukHarf {
    public static void main(String[] args) {
/*
        Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf,
         kucuk harf yada hatali giris seklinde code create ediniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz.");
        char ch= scan.next().charAt(0);
        if (ch>'a' && ch<'z'){
            System.out.println("girilen Harf Kucuk...");
        }else if (ch>'A' && ch<'Z'){
            System.out.println("Girilen harf buyuk...");
        }else System.out.println("hatali giris yaptiniz...");





    }
}
