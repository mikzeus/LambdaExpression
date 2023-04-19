package day02_practice;

import java.util.Scanner;

public class C07_Turnary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter girinz:");
        char ch = scan.next().charAt(0);

        System.out.println(ch>'A' && ch<'Z' || ch>'a' && ch<'z' ? (ch>='A' && ch<='Z' ? "Buyuk Harf " : "Kucuk Harf" ):("Harf Degil"));






    }
}
