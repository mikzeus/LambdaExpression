package com.muner;

public class T05_ArraysTkr {
    /*
        Kullanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niCin şArt
     */

    public static void main(String[] args) {
        String str="ahmet geliyor";
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        /*
        System.out.println();
        String x ="ahmet geliyor";
        StringBuilder sb= new StringBuilder();
        String tesyaz=sb.reverse().toString();
        if (tesyaz.equalsIgnoreCase(x)){
            System.out.println("bu bir polidram cumle");
        }else System.out.println("bu bir polidram cumle degil");

         */


    }
}

