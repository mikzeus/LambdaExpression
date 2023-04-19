package day02_practice;

import java.util.Scanner;

public class C01_Scanner {
    // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde
    // tek bir String olarak sisteme girmesini isteyiniz.
    // adının ilk karakterini, ikinci adının ilk karakterini
    // ve soyadının ilk karakterini BUYUK harfle yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi, 2nci adiniz ve Soyadiniz aralarinda bosluk olacak sekilde giriniz: ");
        String str = scan.nextLine().toUpperCase().trim();

        char firstName= str.charAt(0);
        char secondName=str.charAt(str.indexOf(" ")+1);
        char thirdName = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println("" +firstName+secondName+thirdName);

    }
}
