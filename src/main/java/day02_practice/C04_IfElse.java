package day02_practice;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime girinz:");
        String k1 = scan.next();
        System.out.println("lutfen bir kelime daha girinz:");
        String k2 = scan.next();

        if (k1.length()%2==0){

            String kelimeIlkYarisi= k1.substring(0,k1.length()/2);
            String kelimeSonYarisi = k1.substring(k1.length()/2);
            System.out.println(kelimeIlkYarisi + " " + k2 +" "+ kelimeSonYarisi);
        }
        else {

            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }











    }
}
