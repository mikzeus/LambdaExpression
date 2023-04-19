package day01_practice;

import java.util.Scanner;

public class C10_DaireAlan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yaricap giriniz:");
        float cap = scan.nextFloat();
        float pi= 3.14159f;
        float cevre= 2*pi*cap;
        float alan = pi*cap*cap;

        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.println("Dairenin Alani: " + alan);
    }
}
