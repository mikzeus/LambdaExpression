package com.muner;

import java.util.Scanner;

public class T03_ArrayTkr {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");
        char harf = input.next().toLowerCase().charAt(0);
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (harf == cumle.charAt(i)) {//zeh
                sayac++;

            }


        }
        System.out.println(harf + " harfinden " + sayac + " adet var");


        System.out.println("Lutfen bir cumle giriniz: ");
        String str = input.nextLine();
        System.out.println("aranan harfi giriniz:");
        char istenenHarf = input.next().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (istenenHarf == str.charAt(i)) {
                count++;
            }

        }
        System.out.println(istenenHarf + " harfinde " + count + " adet var: ");


    }
}
