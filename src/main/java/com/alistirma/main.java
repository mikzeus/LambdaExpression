package com.alistirma;

import day18_constructorsstatickeyword.StudentRunner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
/*

        String s= "Java code yaz";
        System.out.println(s.substring(5));

    String sd="Ayhan BEYHAN";
        System.out.print(sd.substring(0,5).toUpperCase());
        System.out.println(sd.substring(6).toLowerCase());
        System.out.println(sd.replace(sd.substring(0),"AYHAN beyhan"));

        String st="Java is Java";
        System.out.println(st.indexOf('a'));
        System.out.println(st.indexOf("Java"));
        System.out.println(st.indexOf('a',4));
        System.out.println(st.indexOf("va",2));
        System.out.println("---------------------------------------");
        System.out.println(st.lastIndexOf('v'));
        System.out.println(st.lastIndexOf("va"));
        System.out.println(st.toUpperCase().lastIndexOf("V"));
        System.out.println(st.toLowerCase().lastIndexOf("j"));


        String s = "Learn";
        String t = "Java";
        System.out.println(s.concat(t));
        System.out.println(""+s.length() + t.length());
        System.out.println(s.concat(String.valueOf(t.length())));
        System.out.println(s.length()>s.charAt(2));

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);
       scan.close();



    }
}
