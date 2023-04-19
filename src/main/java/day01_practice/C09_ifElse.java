package day01_practice;

import day11_nested.NestedIf_01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C09_ifElse {

    //  Kullanıcıdan sisteme bir numara girmesini isteyin.
    //  Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
    //  Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
    //  10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir Sayi Giriniz: ");
        int x = scan.nextInt();

        if (x<0){
            System.out.println("NEGATIF SAYI");

        } else {
            if (x < 10) {

                System.out.println("POZITIF RAKAM");
            } else {
                    System.out.println("POZITIF SAYI");
                }
            }

        // turnary methot

        String sonuc = x<0 ?"Negatif Sayi":x<10 ? "Pozitif Rakam":"Pozitif Sayi";
        System.out.println(sonuc);

        }

    }

