package com.muner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class T01_Tkr {//HESAP MAKINESI
    public static void main(String[] args) {
        //Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile
        // isleme koyup sonucun yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int a = scan.nextInt();

        System.out.println("lutfen +,-,*,/ islemlerinden birini seciniz: ");
        char islem = scan.next().charAt(0);

        System.out.println("Lutfen bir sayi daha giriniz: ");
        int b = scan.nextInt();

        switch (islem) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("lutfen 4 islem sembolu giriniz...");
        }
    }

}
