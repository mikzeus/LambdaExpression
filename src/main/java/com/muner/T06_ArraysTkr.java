package com.muner;

import java.util.Scanner;

public class T06_ArraysTkr {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        while (sayac < 10 && toplam < 500) {
            System.out.println("lutfen bir tamsayi giriniz");
            int sayi = input.nextInt();
            toplam = toplam + sayi;
            sayac++;
            System.out.println(sayac + " adet sayi girdin, toplami " + toplam);
        }



        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // ".. adet sayi girdin, toplami..." yazdirin


        System.out.println("-------------------------------------------");

        int count = 0;
        int sum = 0;
        while (10<count || sum<500){
            System.out.println("lutfen bir tamsayi girin: ");
            int i= input.nextInt();
            sum= sum+i;
            count++;

            System.out.println(count + "adet sayi girdin, toplam: " + sum);

        }


    }
}
