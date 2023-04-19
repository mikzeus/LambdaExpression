package day11_nested;

import java.util.Scanner;

public class Turnory_03 {
    public static void main(String[] args) {
        // verilen yılın artık yıl olup olmadığını kontrol eden metodu yazınız...
        // 1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        // 2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil

            // I. way
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        String  result = year%100 == 0 ? (year%400==0 ? "leap": "Not leap"):(year%4==0 ? "leap": "Not leap");
        System.out.println("result = " + result);

            // II. way

        if(year%100==0){

            if(year%400==0){
                System.out.println("Leap");
            }else{
                System.out.println("Not Leap");
            }

        }else {

            if (year % 4 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Not Leap");
            }
        }
    }
}
