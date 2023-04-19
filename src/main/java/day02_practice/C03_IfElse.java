package day02_practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */
        Scanner scan = new Scanner(System.in);
        String word= scan.next();

        if (word.length()<4){
            System.out.println("Lutfen 3 ve 3ten buyuk bir kelime giriniz");
        }
        else {
            String lastWord = (word.substring(word.length()-3));
            System.out.println(lastWord + " "+ word + " " + lastWord);
        }












    }
}
