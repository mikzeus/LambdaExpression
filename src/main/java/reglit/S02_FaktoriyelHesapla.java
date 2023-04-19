package reglit;

import java.util.Scanner;

public class S02_FaktoriyelHesapla {
    public static void main(String[] args) {


        System.out.println("Enter your integer!");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resultNum = 1;
        String result = "";
        for (int i = 1, x = num; i < num; i++, x--) {
            resultNum *= i;
            result += x + "*";
        }
        System.out.println(num + "!" + "=" + result + "1" + "=" + resultNum);


/*
        //Verilen bir sayının faktoriyelini Recursion ile bulunuz.. Recursive method

       int d = 5; // 1*2*3*4*5
        System.out.println(factoriyeliBul(10));

    }

    public static long factoriyeliBul(int sayi){
        if(sayi == 0 || sayi == 1)
            return 1;
        else
            return (sayi * factoriyeliBul(sayi-1));


        // sayıyı terten yazdıran program
            int reverse = 0;
            while (num != 0) {
                reverse = reverse * 10;
                reverse = reverse + num % 10;
                num = num / 10;

            }
            System.out.println("tersine sayı: " + reverse);

 */




    }
}
