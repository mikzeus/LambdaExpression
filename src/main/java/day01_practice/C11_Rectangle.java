package day01_practice;

import java.util.Scanner;

public class C11_Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kenar uzunluklarini giriniz:");

        byte a = scan.nextByte();
        byte b = scan.nextByte();
        byte c = scan.nextByte();
        byte cevre = (byte) (a+b+c);

        System.out.println("Ucgenin Cevresi: " + cevre);


    }
}
