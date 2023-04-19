package day01_practice;

import java.util.Scanner;

public class C07_ifStatement {

    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz: ");
        double a = scan.nextDouble();

        System.out.println("lutfen bir sayi DAHA giriniz: ");
        double b = scan.nextDouble();

        if (a<b){
            System.out.println("B sayisi A sayisindan Buyuktur...");
        }else {
            System.out.println("A sayisi B sayisindan Buyuktur...");

        }
        String result =  a<b ? "B sayisi A sayisindan Buyuktur...": " A sayisi B sayisindan Buyuktur...";
        System.out.println(result);

    }
}
