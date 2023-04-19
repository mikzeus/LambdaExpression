package day01_practice;

import java.util.Scanner;

public class C05_scanner {

    /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz: ");
        String ad = scan.next();

        System.out.println("Lutfen Soyadinizi giriniz: ");
        String soyad = scan.next();

        System.out.println("Lutfen yasinizi giriniz: ");
        byte yas = scan.nextByte();

        System.out.println("Lutfen Boy olcunuz giriniz: ");
        int boy = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        System.out.println("Adi: " + ad+ "\n" + "Soyadi: " + soyad +"\n" + "Yasi: " + yas +"\n" + "Boy: " +boy +"\n" +
                "Kilo: "+kilo +"\n" );

        scan.close();

    }

}
