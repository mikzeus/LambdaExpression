package day02_practice;

import java.util.Scanner;

public class C06_Turnary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tamsayi girinz:");
        int x = scan.nextInt();

        System.out.println("lutfen bir tamsayi daha girinz:");
        int y = scan.nextInt();

        System.out.println(x == y ? "Sayılar Birbirine Esit" : (x > y ? "Buyuk Sayi: " + x : "Buyuk Sayi: " + y));

    }
}
