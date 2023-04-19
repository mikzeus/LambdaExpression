package day01_practice;

import java.util.Scanner;

public class C04_dikdortgen {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu cm cinsinden girinzi:");
        int kısaKenar= scan.nextInt();
        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu cm cinsinden girinzi:");
        int uzunKenar= scan.nextInt();

        int alan = kısaKenar*uzunKenar;
        int cevre = 2 * (kısaKenar+uzunKenar);

        System.out.println("DIKDORTGENIN ALANI = " +alan);
        System.out.println("Dikdortgenin Cevresi = " + cevre);


    }
}
