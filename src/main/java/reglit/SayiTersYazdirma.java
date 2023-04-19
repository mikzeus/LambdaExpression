package reglit;

import java.util.Scanner;

public class SayiTersYazdirma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
         int num = scan.nextInt();
        int newNum=0;
        for (int i= num ; i>0; i/=10  ) {
          newNum =i % 10;
        }
        System.out.print("Reverse Of The Number: " +newNum % 10);
/*
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }

 */
    }
}
