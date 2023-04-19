package day12_switchcase;

import java.util.Scanner;

public class C02_SwitchLoop {

    // Ex: kullanıcıdan  iki sayı ile yapılacak işlemi alan ve TOPLAMA , CIKARMA,CARPMA, BOLME ve YUZDE
    // işlemlerini yapan kodu yazınız..

    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println("Yapilacak islemi seciniz: " +
                "1- Toplama" +
                "2- cikarma" +
                "3- Carpma" +
                "4- Bolme");

        */
        //Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,%  den birini seciniz..");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+ " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a+ " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a+ " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a+ " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a+ " % " + b + " = " + (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");

        }

    }


}
