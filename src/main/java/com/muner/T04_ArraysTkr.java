package com.muner;

public class T04_ArraysTkr {
    /*
      // Stringi ters cevirmek icin bir Java Programi yazin
      //1.Yol: StringBuilder () kullanarak
      //2.Yol: String Classini kullanarak
      //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        String str="Java ogrenmek cok kolay";
        //1.Yol
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse());
        System.out.println("-------------------------");
        //2.Yol
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("----------------------------------");
        //3.Yol
        tersYazdirma(str);

    }

    private static void tersYazdirma(String str) {
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}

