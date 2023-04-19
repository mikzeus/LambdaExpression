package com.alistirma;

import java.util.Scanner;

public class S03_MeslekSorgu {
    public static void main(String[] args) {
/*
        Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
        qa ==> Quality Analyst
        dev ==> Developer
        ba ==> Busines Analyst
        pm ==> Project Manager
        seklinde bilgilerini yazdiriniz

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen mesleginizi kodlayiniz...");
        String name = scan.next().toLowerCase();

        if (name.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (name.equals("dev")) {
            System.out.println("Developer");
        } else if (name.equals("ba")) {
            System.out.println("Busines Analyst");
        } else if (name.equals("pm")) {
            System.out.println("Project Manager");
        } else System.out.println("lutfen girdiginiz harfleri kontrol ediniz...");

    }
}
