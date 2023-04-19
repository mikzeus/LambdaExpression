package day11_nested;

import java.util.Scanner;

public class Turnary_01 {

    // kullanıcıdan alınan iki sayıdan küçük olanını ekrana yazdırınız..

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        if (first>second){
            System.out.println("first number bigger than second number");
        } else {
            System.out.println("second number bigger than first number");

            //1.Yol: Use if else
            if(first<second){System.out.println(second);} else {System.out.println(first);}
            //2.Yol: Use Ternary
            int result = first<second ? second : first;

            System.out.println("result:" + result);

            System.out.println("*******************");
            System.out.println("enter integers");
            int num = input.nextInt();
            String result1 = num>0 ? "Pozitif" : "Pozitif degil";
            System.out.println("Son sonuc: " + result1);

        }
    }
}
