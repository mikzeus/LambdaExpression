package day01_practice;

import java.util.Scanner;

public class C06_Scanner {

    // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
    // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz: ");

        String adSoyad = scan.nextLine().toUpperCase();

        char isimIlkKarakter = adSoyad.charAt(0);
        char soyisimIlkKarakter = adSoyad.charAt(adSoyad.indexOf(" ")+1);

        System.out.println("" + isimIlkKarakter+soyisimIlkKarakter);



    }

}
