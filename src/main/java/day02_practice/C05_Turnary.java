package day02_practice;

import java.util.Scanner;

public class C05_Turnary {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi girinz:");
        int sayi = scan.nextInt();
        System.out.println(sayi%2==0 ? "sayi cift" : sayi+3);




    }
}
